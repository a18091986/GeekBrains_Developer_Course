const check = document.querySelector('#checkbox');
const btn = document.querySelector('#btn');


btn.addEventListener('click', function (e) {
    const div = document.createElement('div');
    if (!check.checked) {
        div.textContent = "необходимо согласиться с условиями"
        div.style.color = 'red'
    } else {
        div.textContent = 'спасибо за согласие с условиями'
        div.style.color = 'green'
    }
    document.querySelector('body').appendChild(div);
});