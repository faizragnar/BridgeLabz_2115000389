function generateRandomNumbers() {
    let numbers = [];
    for (let i = 0; i < 10; i++) {
        numbers.push(Math.floor(Math.random() * 900) + 100);
    }
    return numbers;
}

function findSecondLargestAndSmallestSorted(arr) {
    arr.sort((a, b) => a - b);
    return {
        secondSmallest: arr[1],
        secondLargest: arr[arr.length - 2]
    };
}

let randomNumbers = generateRandomNumbers();
console.log("Generated Numbers: ", randomNumbers);

let sortedNumbers = [...randomNumbers].sort((a, b) => a - b);
console.log("Sorted Numbers: ", sortedNumbers);

let result = findSecondLargestAndSmallestSorted(sortedNumbers);
console.log("2nd Largest Number: ", result.secondLargest);
console.log("2nd Smallest Number: ", result.secondSmallest);