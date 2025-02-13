// Exemplo 01
// Usando var (escopo global)

console.log("[Var]");
var nome = "Marcus";
console.log(nome);

if(true){
    var nome = "Vinícius";
    console.log(nome);
}

nome = 27;
console.log(nome);

// Usando let (escopo de bloco)

console.log("[Let]");
let idade = 27;
console.log(idade);

if(true){
    let idade = 22;
    console.log(idade);
}

idade = "Rafael";
console.log(idade);

// Usando const (escopo de bloco e valor constante)

console.log("[Const]");
const PI = 3.14;
console.log(PI);

if(true){
    const PI = 4.14;
    console.log(PI);
}

// PI = "Tópicos integradores I";
console.log(PI);