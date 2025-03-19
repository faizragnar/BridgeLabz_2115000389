function rollDie() {
    return Math.floor(Math.random() * 6) + 1;
}

function simulateDieRolls() {
    let counts = { 1: 0, 2: 0, 3: 0, 4: 0, 5: 0, 6: 0 };

    while (Math.max(...Object.values(counts)) < 10) {
        let result = rollDie();
        counts[result]++;
    }

    let maxNumber = Object.keys(counts).reduce((a, b) => counts[a] > counts[b] ? a : b);
    let minNumber = Object.keys(counts).reduce((a, b) => counts[a] < counts[b] ? a : b);

    console.log("Die Roll Results:", counts);
    console.log("Number that reached maximum times:", maxNumber);
    console.log("Number that reached minimum times:", minNumber);
}

simulateDieRolls();