"use strict";


// if (num < 49){
//     console.log('Error');
// } else if (num > 100) {
//     console.log('Много');
// } else {
//     console.log('Ok!')
// }

// (num === 50) ? console.log('true') : console.log('false');

// const num = 5;

// switch(num) {
//     case 49: 
//         console.log('49');
//         break;
//     case 50: 
//         console.log('50');
//         break;
//     case 55: 
//         console.log('55');
//         break;
//     case 51: 
//         console.log('51');
//         break;
//     default: 
//         console.log('ok!');
//         break;
// }
var select = document.querySelector('select');
var para = document.querySelector('p');

select.addEventListener('change', setWeather);

function setWeather() {
    var choice = select.value;

    if (choice === 'sunny') {
        prompt('Сегодня хорошо и солнечно. Носите шорты! Идите на пляж, или в парк, и купите мороженое.', '');
    } else if (choice === 'rainy') {
        para.textContent = 'Дождь падает за окном; возьмите плащ и зонт, и не находитесь слишком долго на улице.';
    } else if (choice === 'snowing') {
        para.textContent = 'Снег падает - морозно! Лучше всего посидеть с чашкой горячего шоколада или слепить снеговика.';
    } else if (choice === 'overcast') {
        para.textContent = 'Дождя нет, но небо серое и мрачное; он все может измениться в любую минуту, поэтому на всякий случай возьмите дождевик.';
    } else {
        para.textContent = '';
    }
}