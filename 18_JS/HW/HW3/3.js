"use strict";

/*
Необходимо попросить пользователя ввести три числа.
Необходимо создать функцию, в которую мы должны передать эти три числа.
Функция должна определить максимальное, среди переданных ей значение и 
вывести сообщение: "Максимальное значение среди чисел N1, N2, N3 равно N."

Примечание: Условимся, что пользователь всегда вводит корректные значения, 
три числа. Проверять их не нужно.
*/

let find_max = (a,b,c) => Math.max(a,b,c);
const a = prompt('Введи 1 число');
const b = prompt('Введи 2 число');
const c = prompt('Введи 3 число');
console.log(find_max(a,b,c));



