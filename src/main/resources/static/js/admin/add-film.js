function submitData() {
    $("#fm").form("submit",{
        url:"/admin/film/save",
        onSubmit:function(){
            var content = CKEDITOR.instances.content.getData();
            if(content ===""){
                $.messager.alert("系统提示","内容不能为空!");
                return false;
            }
            return $(this).form("validate");
        },
        success:function(data){
            var data = eval('('+data+')');
            if(data.success){
                $.messager.alert("系统提示","保存成功");
                resetForm();
            }else{
                $.messager.alert("系统提示","保存失败!");
            }
        }
    });
}

function resetForm() {
    $("#name").val("");
    $("#title").val("");
    $("#imageFile").val("");
    $("#yes").prop("checked",true);
    CKEDITOR.instances.content.setData("");
}

