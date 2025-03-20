const mqtt = require('mqtt');

const client = mqtt.connect('mqtt://54.88.77.233');

client.on('connect', () => {
    console.log('Conectado ao broker MQTT na EC2');

    client.publish('teste/topic', 'Hello MQTT for EC2', () => {
        console.log('Mensagem enviada');
        client.end();
    });
})