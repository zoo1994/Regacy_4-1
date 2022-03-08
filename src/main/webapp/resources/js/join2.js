const pwResult = document.getElementById("pwResult");
const pw = document.getElementById("pw");
const pw2 = document.getElementById("pw2");
const idx = document.getElementById("idx");
const idCheck= document.getElementById("idCheck");
const pwCheck= document.getElementById("pwCheck");
const nameCheck= document.getElementById("nameCheck");
const phoneCheck= document.getElementById("phoneCheck");
const emailCheck= document.getElementById("emailCheck");
const frm = document.getElementById("frm");
const btn = document.getElementById("btn");
const namex = document.getElementById("namex");
const email = document.getElementById("email");
const phone = document.getElementById("phone");

let pwck = false; //같지않을때 false 같으면  true;
//pw pw2같은지 검증
pw2.addEventListener('blur',function(){
    let message ="pw가 일치합니다"
    if(pw.value!=pw2.value){
        pwck=false;
        message="pw가 일치하지 않습니다";
        pw2.value='';
    }else{
        pwck=true;
    }
    pwCheck.innerHTML=message;
})
//검증이 끝나고 pw수정할시
pw.addEventListener("change",function(){
    pwck=false;
    pw2.value="";
    pw2.focus();
})
//pw길이검증
pw.addEventListener('blur',function(){
    if(pw.value.length<8||pw.value.length>12){
        pwCheck.innerHTML="글자수가 맞지 않습니다";
    }
})
//id입력후
idx.addEventListener('blur',function(){
    if(idx.value==''){
        idCheck.innerHTML="id를 입력하세요";
    }
})
//가입버튼
btn.addEventListener("click",function(){
  if(idx.value.length==0){
      alert('Id를 입력하세요')
      idx.focus;
      return;
  }
  if(pw.value.length==0||pw.value.length<8||pw.value.length>12){
    alert('pw가 정확하지 않습니다.')
    pw.focus;
    return;
}
if(pwck==false){
    alert('pw가 일치하지 않습니다.')
    return;
}
if(email.value.length==0){
    alert('email를 입력하세요')
    email.focus;
    return;
}
if(phone.value.length==0){
    alert('phone를 입력하세요')
    phone.focus;
    return;
}
if(namex.value.length==0){
    alert('이름을 입력하세요')
    namex.focus;
    return;
}
frm.submit();
})
