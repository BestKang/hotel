$(function () {
    $('.form_date').datetimepicker({
        weekStart: 1,
        format:'yyyy-mm-dd HH:ii:ss',
        showSecond: true, //显示秒
        stepHour: 1,//设置步长
        stepMinute: 5,
        stepSecond: 30,
        todayBtn: 1,
        autoclose: 1,
        todayHighlight: 1
    });

    var ajaxUrl = {
        'editMainTask': '/taskmanagement/maintask/updatemaintask'
    };

    var submitSet = {
        getAjaxSumitData: function () {
            var submit_data = $('#editTaskForm').serializeObject();
            console.log(submit_data);
            return submit_data;
        },
        ajaxSubmit: function (submit_data) {
            $.ajax({
                url: ajaxUrl.editMainTask,
                type: 'POST',
                data: JSON.stringify(submit_data),
                contentType: 'application/json',
                dataType: 'json',
                success: function (data) {
                    layer.close(loadingIndex);
                    if (data.code != 200) {
                        return layer.Notify.error(data.errorMsg || '编辑主任务失败!')
                    }
                    layer.Notify.success('编辑主任务成功!');

                    setTimeout(function () {
                        window.location.href = "/homepage/load.html";
                    }, 3000);


                },
                error: function (error) {
                    layer.Notify.error('暂时无法连接服务器,请稍候再试!');
                    layer.close(loadingIndex);
                }
            });
        }
    };

    function beforeSubmit() {
        loadingIndex = layer.load();

        $.when({})
            .then(submitSet.getAjaxSumitData)
            .then(submitSet.ajaxSubmit)
            .fail(function (error) {
                layer.hide(loadingIndex);
                console.debug(error);
            });

        return false;
    }
    $('#submitForm').click(function(e){
        beforeSubmit()
    });
});