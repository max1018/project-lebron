import React, { Component } from 'react';
import { StyleSheet, Text, View, TextInput, Dimensions, Button, Alert } from 'react-native';
// import Home from './Home';

const screenWidth = Dimensions.get('window').width - 20;
const screenHeigth = Dimensions.get('window').height - 950;
const endpoint = 'http://localhost:8080/api/login?';



export default class Main extends Component {
    constructor(props) {
        super(props);
        this.state = {
            email: '',
            password: '',
            result: ''
        };
    }

    onSave = async () => {
        const { email, password } = this.state;
        // Alert.alert(email);
        // Alert.alert(password);
        const response = await fetch('http://localhost:8080/api/login?email='+email+'&password='+password, {
            method: 'GET'
        });
        const result = await response.json();
        this.state.result = result;
        if (result.success === false) {
            Alert.alert('Error', 'There was an error while saving the bookmark');
        } else {
            Alert.alert('Sucess', 'Bookmark successfully saved');
            this.onLoad();
        }
    }

    onLoad = async () => {
        this.setState({ result: 'Loading, please wait...' });
        const response = await fetch(endpoint, {
            method: 'GET',
        });
        const result = await response.text();
        this.setState({ result });
    }

    renderScene(route, navigator) {
        return <Home navigator={navigator} />;
    }

    render() {
        return (

            <View style={styles.container}>
                {/* <Navigator
                    ref="navigator"
                    style={styles.container}
                    configureScene={(route) =>
                        Navigator.SceneConfigs.FloatFromBottom}
                    initialRoute={{}}
                    renderScene={this.renderScene}
                /> */}

                <View style={styles.login}>
                    <TextInput
                        style={styles.textInput}
                        placeholder="Email"
                        onChangeText={(text) => this.setState({ 'email': text })}
                        keyboardType="email-address"
                    ></TextInput>

                    <TextInput
                        style={styles.textInput}
                        placeholder="Password"
                        keyboardType="email-address"
                        onChangeText={(text) => this.setState({ 'password': text }

                        )}
                    ></TextInput>

                    <Button
                        style={styles.button}
                        title="Sign in"
                        color="#841584"
                        onPress={this.onSave}
                    >
                    </Button>
                </View>

                <Text>{this.state.result}</Text>


            </View>
        );
    }
}



const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#F5FCFF',
    },
    welcome: {
        fontSize: 20,
        textAlign: 'center',
        margin: 10,
    },
    instructions: {
        textAlign: 'center',
        color: '#333333',
        marginBottom: 5,
    },
    login: {
        // border: 1,

        alignItems: "stretch",
        width: screenWidth,
        margin: 20,
        marginTop: screenHeigth

    },
    textInput: {
        height: 50,
        width: screenWidth,
        borderColor: 'purple',
        borderRadius: 230,
        borderRightWidth: 2,
        borderLeftWidth: 2,
        borderWidth: 2,
        marginTop: 40,
        padding: 10
    },
    button: {
        fontSize: 30
    }
});
