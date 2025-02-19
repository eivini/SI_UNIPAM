// Função que recebe um objeto como argumento

function exibirInfoProduto(produto){
    return `Produto: ${produto.nome}, Preço: ${produto.preco.toFixed(2)}, 
    Estoque: ${produto.estoque} unidade.`;
}

const produto = {
    nome: "Bolo de Cenoura",
    preco: 5.00,
    estoque: 200
}

const produto1 = {
    nome: "Notebook",
    preco: 8500.20,
    estoque: 5
}

const produto2 = {
    nome: "Monitor",
    preco: 5000.00,
    estoque: 10
}

console.log(exibirInfoProduto(produto));
console.log(exibirInfoProduto(produto1));

