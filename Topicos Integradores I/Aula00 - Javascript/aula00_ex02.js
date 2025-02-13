// Exemplo 02
// Funções simples

function saudacao(nome){
    return "Olá, " + nome + "!";
}

console.log(saudacao("Marcus"));
console.log(saudacao(27));

// Função anônima()

const soma = function(a,b){
    return a + b;
}

console.log(soma("Marcus ", "Vinícius"));
console.log(soma(10,15));

// Arrow Funcition (função de seta)

const multiplicacao = (x,y) => x * y;

console.log(multiplicacao("Marcus ", "Vinícius")); //NaN
console.log(multiplicacao(5,6));

// Objeto em javascript

const pessoa = {
    nomeUsuario: "Marcus Vinícius",
    idade: 27,
    email: "marcusalves@unipam.edu.br",
    usuario: "Aluno",
    saudar: function(){
        return "Oi, meu nome é " + 
                this.nomeUsuario + 
                " e eu sou um " + 
                this.usuario +
                ".";
    }
}

console.log(pessoa.nomeUsuario);
console.log(pessoa.saudar());