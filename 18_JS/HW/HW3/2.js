"use strict";

/*
Необходимо попросить пользователя ввести число.
Если пользователь ввел отличное от числа значение, необходимо вывести в консоль
строку: "Значение задано неверно", иначе необходимо будет вызвать функцию 
(нужно будет ее создать), которая будет принимать введенное пользователем 
число. Функция должна вычесть из переданного ей числа 13% и вывести в консоль 
сообщение "Размер заработной платы за вычетом налогов равен N."
*/

function salary(num) {
    console.log(`Заработная плата за вычетом налогов: ${num*0.87}`);
}

const full_salary = Number(prompt('Введите число'));
Number.isFinite(full_salary) ? salary(full_salary) : console.log("Значение задано неверно");
