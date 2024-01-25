const teaSelect = document.querySelector('input[value="tea"]');
const coffeeSelect = document.querySelector('input[value="coffee"]');
const sbmBtn = document.querySelector('#submit');

sbmBtn.addEventListener('click', function (e) {
    if(teaSelect.checked) {
        alert('Чай закончился');
    } else if (coffeeSelect) {
        alert('Кофе закончился');
    }
});