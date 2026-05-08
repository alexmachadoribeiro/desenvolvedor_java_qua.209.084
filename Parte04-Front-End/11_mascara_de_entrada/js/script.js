const form = document.querySelector('form');
const maskCpf = document.querySelector('#cpf');
const maskTel = document.querySelector('#telefone');
const maskCep = document.querySelector('#cep');

// máscaras de entrada
maskCpf.addEventListener('input', function() {
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{3})(\d)/, '$1.$2')
        .replace(/(\d{3})(\d)/, '$1.$2')
        .replace(/(\d{3})(\d{1,2})$/, '$1-$2');
});

maskTel.addEventListener('input', function() {
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{2})(\d)/, '($1) $2')
        .replace(/(\d{4,5})(\d)/, '$1-$2')
        .replace(/(\d{4})\d+?$/, '$1');
});

maskCep.addEventListener('input', function() {
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{5})(\d)/, '$1-$2')
        .replace(/(-\d{3})\d+?$/, '$1');
});

form.addEventListener('submit', function(e) {
    e.preventDefault();

    let nome = document.querySelector('#nome').value;
    let cpf = document.querySelector('#cpf').value;
    let telefone = document.querySelector('#telefone').value;
    let cep = document.querySelector('#cep').value;

    result.innerHTML = `<b>Nome:</b> ${nome}<br>
        <b>CPF:</b> ${cpf}<br>
        <b>Telefone:</b> ${telefone}<br>
        <b>CEP:</b> ${cep}`;
    
    form.reset();
});