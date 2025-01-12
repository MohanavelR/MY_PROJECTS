let answer=document.getElementById('answer')
let btn=document.querySelector('button')
let hsa=['1','2','3','4','5','6','7','8','9','0','a','b','c','d','e','f']
let body=document.querySelector('body')

function Randam(){
    let ram=Math.floor(Math.random()*16)
    return hsa[ram]
}

function changecolor(){
    let color='#'
    let n=1
    while(n<=6){
       color+=Randam()
       n++
    } 
    body.style.backgroundColor=color
    answer.textContent=color    

}
btn.addEventListener('click',changecolor)
