function findRepeatedDigits() {
    let repeatedDigits = [];

    for (let i = 10; i < 100; i++) {
        let strNum = i.toString();
        if (strNum[0] === strNum[1]) {
            repeatedDigits.push(i);
        }
    }

    return repeatedDigits;
}

console.log("Digits repeated twice :", findRepeatedDigits());