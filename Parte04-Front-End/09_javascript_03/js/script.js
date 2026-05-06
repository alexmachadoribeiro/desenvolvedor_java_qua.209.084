const form = document.querySelector('form');

// arrow function (lambda)
const maioridade = () => {
    // declaração de variáveis
    let nome = document.querySelector('#nome').value;
    let idade = document.querySelector('#idade').value;

    // saída de dados
    if (idade >= 18) {
        result.innerHTML = nome + ' é maior de idade.';
    }
    else {
        result.innerHTML = nome + ' é menor de idade.';
    }

    form.reset();
}

// evento
form.addEventListener('submit', function(event) {
    // anular o submit
    event.preventDefault();

    // chama a arrow function
    maioridade();
});