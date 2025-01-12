function Convert(){
    let input=document.getElementById("input")
    let answer=document.getElementById('answer')
    let inputvalue=Number(input.value)
    let cmvalue=(inputvalue/2.54).toFixed(2)
    answer.innerHTML=cmvalue +" inches"
}