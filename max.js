const max = () => {
    const userInput = prompt('Enter the array');

    let array = userInput.split(",").map((item => Number(item.trim())));

    let max = 0;
    for(let i = 0;i < 3;i++)
    {
        if(array[i] > max)
        {
            max = array[i];
        }
    }

    console.log(`Maximum number is ${max}`);
}

max();