const title = document.getElementById("title");
const writer = document.getElementById("writer");
const btn = document.getElementById("btn");
const frm = document.getElementById("frm");
let titleCheck=false;
let writerCheck=false;

btn.addEventListener("click",function(){
    if(titleCheck){
        frm.submit();
    }else{
        alert("필수값을 입력하세요.")
    }
})

title.addEventListener("blur", function(){
    
    if(title.value.length==0){
        titleCheck=false;
    }else{
        titleCheck=true;
    }
})
writer.addEventListener("blur", function(){
    
    if(writer.value.length==0){
        writerCheck=false;
    }else{
        writerCheck=true;
    }
})