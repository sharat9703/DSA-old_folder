let a = [13,12,33,14,125,26];
let b = a.sort((a,b)=>{return b-a});

   
console.log(b.reduce((c,b)=>c+b));