// npm install <name>
// npmjs.com
// npm install uuid

// package.json

// инициализация npm
// npm init -y


// package-lock.json

const uuid = require('uuid');
const hello = require('./hello');

const id = uuid.v4();
console.log(id);
hello.sayHello();

// npm install - устанавливает все зависимости, которые указаны в package.json и обновляет пакеты
// npm ci - устанавливает все зависимости, при этом пакеты не обновляет
// npm uninstall uuid


// npm install -D jest
