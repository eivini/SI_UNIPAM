// Exemplo 03: Classes

class Animal{
    constructor(nome, tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    exibirInformacoes(){
        return `Este é um ${this.tipo} chamado ${this.nome}.`;
    }
}

const cachorro = new Animal("Scooby", "chachorro");
const gato = new Animal("Star", "gato");
const peixe = new Animal("Mey", "peixe");

console.log(cachorro.exibirInformacoes());
console.log(gato.exibirInformacoes());
console.log(peixe.exibirInformacoes());

// Exercício



