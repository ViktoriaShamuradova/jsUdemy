"use strict"; //когда такая строка прописана, то мы говорим скриптовому файлу, что мы работаем в современном режиме
//всегда используй эту строку
//alert("Hello"); //используется о предупреждении пользователя о важном
// const result = confirm("Are you here?"); //задаем пользователю вопрос, у него два варианта ответа. ответ записывается в переменную result
// console.log(result);
//const answer = +prompt("Вам есть 18?", ""); //когда нужен конкретный ответ, второй параметр - это дефолтный ответ, пустые кавычки всегда. placeholder
//один тип данных мжно преобразовывать в другой с помощью +. со стринг в number
//console.log(answer + 5); //вся информация от пользователя = это строка!!!
//prompt alert confirm работают только в браузере, консоль о них не знает и выдаст ошибку , также document, window etc
const answers = []; //ответы заполняются в массив
answers[0] = prompt("Ваше имя?", "");
answers[1] = prompt("Ваша фамилия?", "");
answers[2] = prompt("Сколько лет?", "");

//document.write(answers); //устаревшая комманда
console.log(typeof answers);
console.log(typeof null); //общепризнанная ошибка

// ИНТЕРПОЛЯЦИЯ
//интерполяция это значит что прямо внутри строкиможно вставлять значение переменной
const category = "toys";

//console.log('https://someurl.com/'+category + '/' + '4');
console.log(`https://someurl.com/${category}/5`); //формирование строки стало приятнее. такой прием работает только с такими ковычками

const user = "Ivan"; //это значение может придти из бд, из дугого скрипта, ответ пользователя
alert(`привет, ${user}`);

//ОПЕРАТОРЫ JS
console.log("arr" + "- object"); //строка конкатенация
console.log(4 + +"- object"); //nan , п ч выполняем действие которое не подлежит математической логике
console.log(4 + +"5"); // 9 п ч 5 превратилась в число
//унарный плюсставится перед чем-то, п ч он использует один аргумент для своей раьоты
//инкременты и декременты
let incr = 10,
  decr = 10;
incr++; //инкремент увеличение post увеличивается при СЛЕДУЮЩЕМ использовании
decr--; //декремент уменьшение post
console.log(incr);
console.log(decr);

console.log(5 % 2);

console.log(2 * 4 == "8"); //true так работает, п ч сравнивается именно по значению, не по типу данных
console.log(2 + 2 * 2 === "8"); //если нужно сравнить и тип данных тоже - строгое сравнение false
console.log(2 + 2 * 2 === 8); //false , оператор сравнения идет последним
console.log(2 + 2 * 2 !== 8); // строгое сравнение по ттипу

//&& || !
const isChecket = false,
  isClose = true;
console.log(isChecket && isClose); //правда, если оба правда
console.log(isChecket || !isClose);
