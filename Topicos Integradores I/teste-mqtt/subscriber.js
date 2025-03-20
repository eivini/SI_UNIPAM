const mqtt = require('mqtt');

const client = mqtt.connect('mqtt://54.88.77.233');

client.on('connect', () => {
    console.log('Conectado ao broker MQTT na EC2');
    client.subscribe('teste/topic', (err) => {
        if(!err){
            console.log('Inscrito no tópico test/topic');
        }
    })
})

client.on('message', (topic, message) => {
    console.log(`Mensagem recebida no tópico ${topic}: ${message.toString()}`);
})