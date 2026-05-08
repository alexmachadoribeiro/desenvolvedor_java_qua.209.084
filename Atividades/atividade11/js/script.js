// TODO: atividade 11
// Desenvolva uma página HTML onde o usuário pode calcular o seu IMC
// NOTE: use Bootstrap para fazer uma página bem bonita

const form = document.querySelector('form');
const calcularImc = (peso, altura) => peso / Math.pow(altura, 2);
const exibirDiag = (imc) => (imc < 18.5) ? "Você está abaixo do peso." :
        (imc < 25) ? "Você está no peso ideal." :
        (imc < 30) ? "Você está acima do peso." :
        (imc < 35) ? "Você está obeso." :
        (imc < 40) ? "Você está com obesidade nível II" :
        "Você está com obesidade mórbida.";

form.addEventListener('submit', function(e) {
    e.preventDefault();

    let peso = document.querySelector('#peso').value.replace(",", ".");
    let altura = document.querySelector('#altura').value.replace(",", ".");
    let imcResult = calcularImc(peso, altura);

    imc.innerHTML = `Seu IMC é ${imcResult.toFixed(2)}`;
    diag.innerHTML = exibirDiag(imcResult);

    form.reset();
})