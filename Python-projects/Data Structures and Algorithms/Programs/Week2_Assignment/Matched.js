let matched = (s) => {
    let c = s.split("");
    let i = 0;
    let count = 0;
    while (count >= 0 && i < c.length) {
        if (c[i] == "(") {
            count++;
        }
        if (c[i] == ")") {
            count--;
        }
        i++;
    }
    return count == 0
}

console.log(matched("()()()()"));
