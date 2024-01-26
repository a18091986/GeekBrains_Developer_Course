const options = {
	method: 'GET',
	headers: {
		'X-RapidAPI-Key': '34bba2b52emsh9069b54ce307152p1da83ajsna01e65c25613',
		'X-RapidAPI-Host': 'numbersapi.p.rapidapi.com'
	}
};

const numbers = [1729, 11, 13, 51, 101];
export const data = [];

for (const iterator of numbers) {
    const url = `https://numbersapi.p.rapidapi.com/${iterator}/math?fragment=true&json=true`;
    const response = await fetch(url, options);    
    const result = await response.text();
    data.push(JSON.parse(result));
}

console.log(data);

