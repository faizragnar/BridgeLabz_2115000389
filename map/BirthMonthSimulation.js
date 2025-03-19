function generateBirthMonths() {
    let months = {};

    for (let i = 1; i <= 12; i++) {
        months[i] = [];
    }

    for (let person = 1; person <= 50; person++) {
        let birthMonth = Math.floor(Math.random() * 12) + 1;
        months[birthMonth].push(person);
    }

    for (let month in months) {
        if (months[month].length > 0) {
            console.log(`Month ${month}: ${months[month].join(', ')}`);
        }
    }
}

generateBirthMonths();