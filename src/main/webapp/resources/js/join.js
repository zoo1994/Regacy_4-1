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
let idc=false;
let pwc=false;
let namec=false;
let emailc=false;
let phonec=false;
btn.addEventListener("click",function(){
    if(idc&&pwc&&namec&&emailc&&phonec){
    frm.submit();}
    else{
        alert("필수요건을 확인하세요.");
    }
})

pw.addEventListener("keypress",function(){
    let length=pw.value.length;
    let message="잘못된 비번";
    if(length>=8&& length<=12){
        message="정상적인 비번";
        pws=true;
    }else{
        pwc=false;
    }
    pwResult.innerHTML=message;
});

idx.onblur=function(){
    let v = idx.value;
    if(v.length==0){
        idCheck.innerHTML="id입력이 비어있습니다";
        idc=false;
    }else{
        idCheck.innerHTML="";
        idc=true;
    }
};

pw2.onblur=function(){
    let pv= pw.value;
    let pv2=pw2.value;
    if(pv==pv2){
        pwCheck.innerHTML="비밀번호 일치"
        pwc=true;
    }else{
        pwCheck.innerHTML="비밀번호 불일치"
        pwc=false;
    }
}

namex.onblur=function(){
    if(namex.value.length==0){
        namec=false;
        nameCheck.innerHTML="이름을 입력하세요";
    }else{
        namec=true;
        nameCheck.innerHTML="이름이 입력되었습니다."
    }
}
email.onblur=function(){
    if(email.value.length==0){
        emailc=false;
        emailCheck.innerHTML="이메일을 입력하세요";
    }else{
        emailc=true;
        emailCheck.innerHTML="이메일이 입력되었습니다."
    }
}
phone.onblur=function(){
    if(phone.value.length==0){
        phonec=false;
        phoneCheck.innerHTML="이름을 입력하세요";
    }else{
        phonec=true;
        phoneCheck.innerHTML="이름이 입력되었습니다."
    }
}



