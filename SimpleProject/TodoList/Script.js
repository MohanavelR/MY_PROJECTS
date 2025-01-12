let lists=document.getElementById('ans')
let input=document.getElementById('input')
let btn=document.getElementById('btn')

let todos=[]

window.onload=()=>{
todos= JSON.parse(localStorage.getItem('todos')) || []
todos.forEach((todo)=>addtodo(todo)) 
} 

btn.addEventListener('click',()=>{
   todos.push(input.value)
   localStorage.setItem('todos',JSON.stringify(todos))
   addtodo(input.value)  
   input.value=' '

})
function addtodo(todo){
     let para=document.createElement('p') 
     para.innerHTML=todo
     lists.appendChild(para)
     para.addEventListener('click',()=>{
      para.style.textDecoration='line-through'
      removetodo(todo)
     })
     para.addEventListener('dblclick',()=>{
      lists.removeChild(para)
      removetodo(todo)
     })
    
}
function removetodo(todo){
   let index=todos.indexOf(todo)
   localStorage.setItem
   if(index>-1){
      todos.splice(index,1)
   }
   localStorage.setItem('todos',todos)
}
