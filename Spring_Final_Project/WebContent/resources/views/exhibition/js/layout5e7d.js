/********************************************************************************************
 * IE CSS ISSUE SAMPLE
 *
 * before
 * CSS	: .joinHome:before{}
 * JS	: $('.joinHome').prev().addClass('ClassName');
 *
 * after
 * CSS	: .repleArea .btn:after{}
 * JS	: $('.repleArea .btn').next().addClass('ClassName')
 *
 * first-child
 * CSS	: .repleList > li:first-child{}
 * JS	: $('.repleList > li:first').addClass('ClassName');
 *
 * last-child
 * CSS	: .ABannerList03 li:last-child{}
 * JS	: $('.ABannerList03 > li:last').addClass('ClassName');
 *
 * nth-of-type(n)
 * CSS	: .ticketList .list li:nth-of-type(3) .txt{}
 * JS	: $('.ticketList .list > li:eq(n) .txt').addClass('ClassName');
 *
 ********************************************************************************************/

/*
 * IE CSS ISSUE START
 */
var setStyle = function () {
    /* common.css */
    /* 마이페이지 스크랩, 폴더 탭 */
    $('.tab01  li:first').addClass('first');
    /* 공연/전시 리스트 탭 */
    $('.tab02 dd li:first').addClass('first');
    $('.tab02 dd li:last').addClass('last');
    /* 공연/전시 상세 탭 */
    $('.tab03 li:first').addClass('first');
    $('.tab03.num5 li:first').addClass('first');
    /* 별 평점 드래그 */
    $('.gradeWrite .pointOff button:first').addClass('first');
    /* 그림자 있는탭 탭 */
    $('.tabDepth1 > li:first').addClass('first');
    $('.tabDepth1 .tabDepth2').each(function () {
        $(this).find('li:first').addClass('firstDep2');
    });
    /* 탭 3개 */
    $('.tabDepth1 > li:first').addClass('first');
    /* 탭 9개 */
    $('.num09 .tabDepth1 > li:first').addClass('first');
    /* documentList01 */
    $('ul.documentList01 > li').each(function () {
        $(this).find('li:first').addClass('first');
    });
    /* documentList02 */
    $('ul.documentList02 > li:first').addClass('first');
    $('ul.documentList02 li').each(function () {
        $(this).find('li:first').addClass('liFirst');
    });
    /* 문서상단 */
    $('div.infoHead01 dd:last').addClass('last');
    $('div.infoHead01 li:last').addClass('last');
    /* 데이터 테이블 */
    $('table.data01 thead th:first').addClass('first');
    $('table.data01 tbody td:first').addClass('first');
    /* boardList01 */
    $('table.boardList01 thead th:first').addClass('first');
    $('table.boardList01 thead th:last').addClass('last');
    $('table.boardView01 thead + tbody tr:first').addClass('first');

    /* index.css */
    /* 왼쪽 티켓 */
    $('.ticketList li').each(function () {
        $(this).find('li:first').addClass('first');
        $(this).find('li:eq(2)').addClass('eq2');
    });
    /* sns */
    $('.snsWrap ul li:first').addClass('first');

    /* contentPerform.css */
    /* 오늘의 공연 리스트 */
    $('.scheduleBox .scheduleList li:first').addClass('first');

    /* layout.css */
    /* 사이트맵 */
    $('#sitemap .siteDiv:first').addClass('first');
    $('#sitemap .siteDiv').each(function () {
        $(this).find('div:first').addClass('first2');
    });

    /* 공연/전시/축제 리스트*/
    $('.perFormList01 > li:odd').addClass('odd-child');
    $('.festivalList > li:odd').addClass('odd-child');
};

/*
 * IE CSS ISSUE END
 */

/**
 * culture util
 */
if (window['console'] === undefined || console.log === undefined) {
    console = {
        log : function() {},
        info : function() {},
        warn : function() {},
        error : function() {}
    };
}

/* ----------------------------------------------------------------------------------- */
/* 공통 함수 관련 부분 */
/* ----------------------------------------------------------------------------------- */

// popup
function openPopup(url, width, height) {
    var option = 'width=' + width + ',height=' + height + ',toolbar=no,menubar=no,status=no,scrollbars=yes,resizable=no';
    window.open(url, '', option);
    return false;
}

// Popup 호출
// ex : Popup.ticket(123);
var Popup = {
    ticket : function (seq) {
        var url =  '/popup/ticketDownload.do?seq=' + seq;
        // window.open(url, 'ticketPopup', 'width=657,height=328');
        window.open(url, 'ticketPopup', 'width=657,height=347');
        return false;
    },
    uci : function (url) {
        window.open(url, 'uciPopup', 'width=650,height=310');
        return false;
    }
};

// LayerPopup 호출
// Mask.open();
var Layer = {
    mask : function(z, callback) {
        if ($('.jq_mask').size() == 0) {
            $('body').append('<div class="jq_mask" />');
        }
        if (!$('div.jq_mask').is('visible')) {
            $('div.jq_mask').stop().css({
                opacity : 0.3,
                backgroundColor : '#000',
                width : '100%',
                height : '100%',
                top : 0,
                left : 0,
                position : 'fixed',
                zIndex : (z == undefined ? 9999 : z),
                display : 'none'
            }).show();
        }

        if (callback != undefined && callback != null) {
            callback();
        }
    }
    ,unmask : function(callback) {
        $('.jq_mask').stop().hide();

        if (callback != undefined && callback != null) {
            callback();
        }
    }
};

// LayerPopup
var LayerPopup = function (option) {
    // option 정의 아래 3개 프로퍼티
    var param = {
        layer	:	null
        ,open	:	null
        ,close	:	null
    };
    param = $.extend({}, param, option);

    // validation
    for (var i in param) {
        if (param[i] == null) {
            alert('요청 값이 올바르지 않습니다.');
            return false;
        }
    }

    var layer		=	$(param.layer);

    if (layer.size() == 0) {
        alert('요청하신 팝업이 존재하지 않습니다.');
        return null;
    }

    var layerHTML = layer.clone().wrapAll("<div />").parent().html();
    layer.remove();
    $('body').append(layerHTML);

    layer		=	$(param.layer);
    var btnOpen		=	$(param.open);
    var btnClose	=	$(param.close);

    // open
    btnOpen.on('click', function () {
        layer.show().attr("tabindex","0").focus();
        Layer.mask();
    });

    // close
    btnClose.on('click', function () {
        layer.hide();
        Layer.unmask();
        btnOpen.focus();
    });

    return layer;
};

// scroll
var scrollTop = function (selector) {
    var target = $(selector);
    if (target.size() == 0) {
        return false;
    }
    $('html, body').animate({scrollTop : target.offset().top}, 200, 'easeInOutQuint');
};

// form design
var setDatePicker = function (callback) {

    if ($('.jqDatePicker').size() == 0) {
        return false;
    }

    var speed = 80;
    var visible = false;
    //주어진 범위 일자 선택 시 true ex)전체, 1일, 1주, 1달, 1년
    var rangeSelect = false;

    $(function () {
        $('.jqDatePicker').each(function () {

            var _this = this;
            var html = [
                '<div class="itemBox">'
                /*,'	<em class="tit">기간</em>'*/
                ,'	<ul>'
                ,'		<li><a href="#all">전체</a></li>'
                ,'		<li><a href="#day">1일</a></li>'
                ,'		<li><a href="#week">1주일</a></li>'
                ,'		<li><a href="#month">1개월</a></li>'
                ,'		<li><a href="#year">1년</a></li>'
                ,'	</ul>'
                ,'	<div class="itemOption">'
                ,'		<em>기간선택</em>'
                ,'		<div class="inputBox"><input type="text" class="startDate" placeholder="시작일" title="검색기간 시작일" /></div>'
                ,'		<span class="dash">~</span>'
                ,'		<div class="inputBox"><input type="text" class="endDate" placeholder="종료일" title="검색기간 종료일" /></div>'
                ,'		<span class="button white"><button type="button">기간적용</button></span>'
                ,'	</div>'
                ,'</div>'
            ];

            $(this).append(html.join(''));

            var title		=	$(this).find('.tit');
            var btnAll		=	$(this).find('.itemBox a:eq(0)');
            var btnDay		=	$(this).find('.itemBox a:eq(1)');
            var btnWeek		=	$(this).find('.itemBox a:eq(2)');
            var btnMonth	=	$(this).find('.itemBox a:eq(3)');
            var btnYear		=	$(this).find('.itemBox a:eq(4)');

            var startDate	=	$(this).find('.itemBox .startDate');
            var endDate		=	$(this).find('.itemBox .endDate');
            var btnCal		=	$(this).find('.itemBox .itemOption em');
            var btnSelect	=	$(this).find('.itemBox .itemOption button');

            var data		=	$(_this).data();
            /*var targetBegin	=	$(data.begin);
            var targetEnd	=	$(data.end);*/
            var targetBegin = $('#sSdate');
            var targetEnd = $('#sEdate');

            title.attr('title', '기간 선택');

            this.setDate = function (v, d1, d2) {
                //title.text(v);
                title.attr('title', '기간은 ' + v);
                //v 텍스트 내용에 따라 li class 추가
                if(rangeSelect) {
                    if(v == '전체'){
                        btnAll.parent().addClass('on').siblings().removeClass('on');
                    } else if(v == '1일'){
                        btnDay.parent().addClass('on').siblings().removeClass('on');
                    } else if(v == '1주일'){
                        btnWeek.parent().addClass('on').siblings().removeClass('on');
                    } else if(v == '1개월'){
                        btnMonth.parent().addClass('on').siblings().removeClass('on');
                    } else if(v == '1년'){
                        btnYear.parent().addClass('on').siblings().removeClass('on');
                    }
                } else {
                    btnAll.parent().removeClass('on').siblings().removeClass('on');
                }

                /*startDate.val(d1).datepicker("option", "maxDate", d1);
                endDate.val(d2).datepicker("option", "minDate", d2);*/

                startDate.val(d1);
                endDate.val(d2);

                targetBegin.val(d1);
                targetEnd.val(d2);

                rangeSelect = false;
            };

            this.setClose = function () {
                $('.jqDatePicker').find('.startDate, .endDate').datepicker('hide');
                $('.jqDatePicker .itemBox').slideUp(speed);
            };

            if (targetBegin.val() != '') {
                startDate.val(targetBegin.val());
                //endDate.datepicker("option", "minDate", targetBegin.val());
                //title.text('기간선택');
            }

            if (targetEnd.val() != '') {
                //startDate.datepicker("option", "maxDate", targetEnd.val());
                endDate.val(targetEnd.val());
                //title.text('기간선택');
            }

            btnAll.on('click', function () {
                rangeSelect = true;
                _this.setDate($(this).text(), '', '');
                _this.setClose();
                return false;
            });
            btnDay.on('click', function () {
                rangeSelect = true;
                var d = $.datepicker.formatDate('yy-mm-dd', new Date());
                _this.setDate($(this).text(), d, d);
                _this.setClose();
                return false;
            });
            btnWeek.on('click', function () {
                rangeSelect = true;
                /*var d1 = $.datepicker.formatDate('yy-mm-dd', new Date());
                var d2 = setDateFormat(d1, 'week', 7);*/
                var d2 = $.datepicker.formatDate('yy-mm-dd', new Date());
                var d1 = setDateFormat(d2, 'week', -7);
                _this.setDate($(this).text(), d1, d2);
                _this.setClose();
                return false;
            });
            btnMonth.on('click', function () {
                rangeSelect = true;
                /*var d1 = $.datepicker.formatDate('yy-mm-dd', new Date());
                var d2 = setDateFormat(d1, 'month', 1);*/
                var d2 = $.datepicker.formatDate('yy-mm-dd', new Date());
                var d1 = setDateFormat(d2, 'month', -1);
                _this.setDate($(this).text(), d1, d2);
                _this.setClose();
                return false;
            });
            btnYear.on('click', function () {
                rangeSelect = true;
                /*var d1 = $.datepicker.formatDate('yy-mm-dd', new Date());
                var d2 = setDateFormat(d1, 'year', 1);*/
                var d2 = $.datepicker.formatDate('yy-mm-dd', new Date());
                var d1 = setDateFormat(d2, 'year', -1);
                _this.setDate($(this).text(), d1, d2);
                _this.setClose();
                return false;
            });

            startDate.datepicker({
                //defaultDate : "+1w",
                changeYear : true,
                changeMonth : true,
                numberOfMonths : 2,
                onClose : function(selectedDate) {
                    //endDate.datepicker("option", "minDate", selectedDate);
                    _this.setDate('기간선택', selectedDate, endDate.val());
                },
                showButtonPanel : true
            });
            endDate.datepicker({
                defaultDate : "+1w",
                changeYear : true,
                changeMonth : true,
                numberOfMonths : 2,
                onClose : function(selectedDate) {
                    //startDate.datepicker("option", "maxDate", selectedDate);
                    _this.setDate('기간선택', startDate.val(), selectedDate);
                },
                showButtonPanel : true
            });

            btnCal.on('click', function () {
                if (startDate.val() == '') {
                    startDate.datepicker('show');
                } else {
                    endDate.datepicker('show');
                }
                return false;
            });

            btnSelect.on('click', function () {
                _this.setClose();
                return false;
            });

        }).on({
            click : function () {
                // $(this).addClass('focus');
                $(this).find('.itemBox').slideDown(speed, function(){
                    //$('.itemBox .tit').click(function(){
                    //	$(this).parent('.itemBox').slideUp(speed);
                    //	return false;
                    //});
                });
                return false;
            }
            ,mouseenter : function () {
                visible = true;
            }
            ,mouseleave : function () {
                visible = false;
            }
        });

        $('.ui-datepicker-div').on({
            mouseenter : function () {
                visible = true;
            }
            ,mouseleave : function () {
                visible = false;
            }
        });

        $('#wrap').live('mousedown', function (e) {
            // e.stopPropagation();
            if (!visible) {
                $('.jqDatePicker').find('.startDate, .endDate').datepicker('hide');
                $('.jqDatePicker .itemBox').slideUp(speed);
            }
        });

        if (callback != undefined && callback != null) {
            callback();
        }
    });
};


/* ----------------------------------------------------------------------------------- */
/* 레이아웃 관련 부분 */
/* ----------------------------------------------------------------------------------- */

/**
 * 공통 변수
 */
// gnb
// gnb
var setGnb = function () {
    var $gnb = $('#gnb');
    var $gnbBg = $('#gnbBg');

    if ($gnb.size() == 0 || $gnbBg.size() == 0) {
        return false;
    }

    var timer = null;
    var fnClose = function () {
        $gnb.removeClass('focus');
        $gnbBg.hide();

        //$gnb.find('[data-current]').parent().addClass('current');
        $gnb.find('#gnb-on').parent().addClass('current');
        $gnb.find('#gnb-sub-on').parent().addClass('current');
    };

    fnClose(); // 초기값

    // mouse event
    $gnbBg.on('mouseenter', function () {
        if (timer != null) {
            clearTimeout(timer);
        }
    }).on('mouseleave', function () {
        timer = setTimeout(fnClose, 100);
    });

    $gnb.find('> li').on('mouseenter', function () {
        $(this).addClass('on');
        $gnb.addClass('focus');
        $gnbBg.show();

        if (timer != null) {
            clearTimeout(timer);
        }
    }).on('mouseleave', function () {
        $(this).removeClass('on');
        timer = setTimeout(fnClose, 100);
    });

    // keyboard event
    $gnb.find('> li > a').on('focus', function () {
        $(this).addClass('jqFocus');
        $(this).parent().addClass('on');
        $gnb.addClass('focus');
        $gnbBg.show();

        if (timer != null) {
            clearTimeout(timer);
        }
    }).on('blur', function () {
        $(this).removeClass('jqFocus');
        $(this).parent().removeClass('on');
        timer = setTimeout(fnClose, 100);
    });

    $gnb.find('> li > ul > li > a').on('focus', function () {
        $(this).addClass('jqFocus');
        $(this).parent().parent().parent().addClass('on');
        $gnb.addClass('focus');
        $gnbBg.show();

        if (timer != null) {
            clearTimeout(timer);
        }
    }).on('blur', function () {
        $(this).removeClass('jqFocus');
        $(this).parent().parent().parent().removeClass('on');
        timer = setTimeout(fnClose, 100);
    });

    return false;
};


// login
var setLogin = function () {
    var login = $('.jqLogin');
    var logout = $('.jqLogout');
    var url = encodeURIComponent(window.location.pathname + window.location.search);

    if (login.size() > 0) {
        login.on('click', function () {
            window.location.href = '/sso/login.do?redirect_url=' + url;
            return false;
        });
    }

    if (logout.size() > 0) {
        logout.on('click', function () {
            // 기존
            //window.location.href = '/member/j_spring_security_logout.do?spring-security-redirect=' + url;
            // sso 설치 후
            window.location.href = '/member/j_spring_security_logout.do?spring-security-redirect=/cultureSso/SPLogout.jsp&redirect='+url;
            // sso 개발 테스트
            //window.location.href = 'http://175.125.91.124/member/j_spring_security_logout.do?spring-security-redirect=/cultureSso/SPLogout.jsp&redirect='+url;
            return false;
        });
    }
};


// placeholder
var setPlaceholderAuto = function () {

    var msieVersion = 0;

    if (navigator.appName.toLowerCase() == 'microsoft internet explorer') {
        var ua = navigator.userAgent.toLowerCase();
        var re = new RegExp("msie ([0-9]{1,}[/.0-9]{0,})");

        if (re.exec(ua) != null) {
            msieVersion = parseFloat(RegExp.$1);
        }
    }

    if (msieVersion > 9 || msieVersion == 0) {
        return false;
    }

    // ie9 이하에서만 동작
    $('input[placeholder][type=text], textarea[placeholder]').each(function (i) {
        try {
            $(this).data({
                type			:	$(this).attr('type')
                ,placeholder	:	$(this).attr('placeholder')
                ,color			:	$(this).css('color')
            });

            $(this).off('focus blur').on({
                focus : function () {
                    var data = $(this).data();

                    $(this).css('color', data.color);

                    if (data.type == 'text' || data.type == 'password') {
                        // $(this).attr('type', data.type);
                        this.type = data.type;
                    }

                    if ($(this).val() == data.placeholder) {
                        $(this).val('');
                    }
                },
                blur : function () {
                    var data = $(this).data();

                    if ($(this).val() == '' || $(this).val() == data.placeholder) {
                        $(this).css('color', '#ccc');

                        if (data.type == 'text' || data.type == 'password') {
                            // $(this).attr('type', 'text');
                            this.type = 'text';
                        }

                        $(this).val(data.placeholder);

                    } else {
                        $(this).css('color', data.color);

                        if (data.type == 'text' || data.type == 'password') {
                            // $(this).attr('type', data.type);
                            this.type = data.type;
                        }
                    }
                }
            }).blur();
        } catch (e) {
        }
    });
};

// SNS SHARE
var setTCShareSNS = function () {
    var jqTCSnsShareOpen	=	$('.jqTCSnsShareOpen');
    var jqTCSnsShare		=	$('.jqTCSnsShare');
    var jqTCSnsShareChild		=	$('.jqTCSnsShare > li');

    if (jqTCSnsShareOpen.size() == 0 || jqTCSnsShare.size() == 0 ) {
        return false;
    }
    var snsTimer = null;
    var fnCloseSNS = function () {
        jqTCSnsShare.stop().fadeTo(1000, 0);
    };

    jqTCSnsShareOpen.on({
        mouseenter : function () {
            if (snsTimer != null) {
                clearTimeout(snsTimer);
            }
            jqTCSnsShare.stop().fadeTo(500, 1);
        },
        focus : function () {
            if (snsTimer != null) {
                clearTimeout(snsTimer);
            }
            jqTCSnsShare.stop().fadeTo(500, 1);
        },
        mouseleave : function () {
            snsTimer = setTimeout(fnCloseSNS, 500);
        },

        click : function () {
            return false;
        }
    });

    jqTCSnsShare.on({
        mouseenter : function () {
            if (snsTimer != null) {
                clearTimeout(snsTimer);
            }
        },
        mouseleave : function () {
            snsTimer = setTimeout(fnCloseSNS, 500);
        }
    });

    jqTCSnsShareChild.on({
        focusin : function () {
            if (snsTimer != null) {
                clearTimeout(snsTimer);
            }
        }
    });

    var fnText = function ($obj, txt, org) {
        if ($obj.size() == 0 || txt == undefined || txt == null || txt == '') {
            return org;
        }
        if (txt.indexOf('.') == 0 || txt.indexOf('#') == 0) {
            if ($(txt).size() > 0) {
                txt = $(txt).text();
            }
        } else if (txt == 'this') {
            txt = $obj.text();
        }
        return txt;
    };

    var fnShare = function () {
        var title		=	$('title:eq(0)').text();
        var caption		=	$('title:eq(0)').text(); //.replace('| 문화포털', '');
        var desc		=	'';
        var link		=	window.location.href;
        var picture		=	window.location.origin + '/images/portal/layout/logo.png';

        //meta 정보
        var og_title		=	$( 'meta[property="og:title"]' ).attr( 'content' );
        var og_caption		=	$( 'meta[property="og:caption"]' ).attr( 'content' );
        var og_desc			=	$( 'meta[property="og:description"]' ).attr( 'content' );
        var og_picture		=	$( 'meta[property="og:image"]' ).attr( 'content' );

        if(og_title != null){
            title = og_title;
        }
        if(og_caption != null){
            caption = og_caption;
        }
        if(og_desc != null){
            desc = og_desc;
        }
        if(og_picture != null){
            picture = og_picture;
        }

        title = $.trim(title.replace(/\"/g, "＂").replace(/'/g, "＇"));
        caption = $.trim(caption.replace(/\"/g, "＂").replace(/'/g, "＇"));
        desc = $.trim(desc.replace(/\"/g, "＂").replace(/'/g, "＇"));
        link = $.trim(link);
        picture = $.trim(picture);

        return {
            title		:	title
            ,caption		:	caption
            ,desc		:	desc
            ,link		:	link
            ,picture	:	picture
        };
    };

    // 페이스북
    jqTCSnsShare.find('.snsF').on('click', function () {

        var data = fnShare();

        var callbackDomain = 'http://www.culture.go.kr';

        if (callbackDomain == 'http://localhost') {
            alert('localhost에서 공유할 경우 문화포털 메인으로 이동 됩니다.');
            callbackDomain = 'http://www.culture.go.kr';
        }

        var shareImg = $('[name=share_img]').val();
        if(shareImg == null || shareImg == '') {
            shareImg = '/images/portal/layout/logo.png';
        }

        shareImg = 'http://www.culture.go.kr' + shareImg;

        var shareURL	=	'https://www.facebook.com/dialog/feed';
        //shareURL	+=	'?app_id=524531650932414';
        shareURL	+=	'?app_id=1969619309921418';	// facebook 신규키로 변경
        shareURL	+=	'&display=popup';
        shareURL 	+=	'&title='			+	encodeURIComponent(data.title);
        //shareURL	+=	'&caption='			+	encodeURI(data.caption);
        shareURL	+=	'&caption='			+	'www.culture.go.kr';
        shareURL 	+=	'&description='		+	encodeURI(data.desc);
        shareURL	+=	'&link='			+	encodeURIComponent(data.link);
        shareURL	+=	'&picture='			+	encodeURI(data.picture);
        //shareURL	+=	'&picture='			+	shareImg;
        // shareURL	+=	'&redirect_uri='	+	encodeURIComponent(callbackDomain + '/facebook/feed/callback.do');

        window.open(shareURL, 'facebookFeed', 'width=640,height=400');
        return false;
    });

    // 트위터
    jqTCSnsShare.find('.snsT').on('click', function () {
        var data		=	fnShare();
        // var status	=	(data.link + ' ' + data.caption).substring(0, 140);
        // var shareURL	=	'http://twitter.com/home?status=' + encodeURIComponent(status);

        var shareURL	=	'http://twitter.com/share';
        shareURL	+=	'?url='		+	encodeURIComponent(data.link);
        shareURL	+=	'&text='	+	encodeURIComponent(data.title);

        window.open(shareURL, 'twitterFeed', 'width=600,height=400');
        return false;
    });

    // 구글
    jqTCSnsShare.find('.snsG').on('click', function () {
        var data		=	fnShare();
        var shareURL	=	'https://www.google.com/bookmarks/mark?op=add';
        shareURL	+=	'&bkmk='	+	encodeURIComponent(data.link);
        shareURL	+=	'&title='	+	encodeURI(data.title);

        window.open(shareURL);
        return false;
    });

    // 카카오톡
    jqTCSnsShare.find('.snsK').on('click', function () {
        var data = fnShare();
        kakaoTalk.link( kakaoTalk.linkParam(data.link, data.title + ' ' + data.link) );
        return false;
    });

    // 카카오스토리
    jqTCSnsShare.find('.snsKS').on('click', function () {
        var data = fnShare();
        kakaoStory.link( kakaoStory.linkParam(data.link, data.title, data.desc, null) );
        return false;
    });

    //blog 스크랩
    jqTCSnsShare.find('.snsU').on('click', function () {
        var _href = $(location).attr('href');
        if(window.clipboardData) {
            window.clipboardData.setData('Text', _href);
            alert('복사되었습니다. 블로그나 카페에 Ctrl+V로 붙여 넣기 하세요.');
        } else {
            temp = prompt('Ctrl+C로 복사한 후 블로그나 카페에 Ctrl+V로 붙여 넣기 하세요.', _href);
        }
    });

};

// 프린트
var setTCPrint = function () {
    var jqTCPrint = $('.jqTCPrint');

    if (jqTCPrint.size() == 0) {
        return false;
    }

    jqTCPrint.on('click', function () {
        window.print();
        return false;
    });

};

// 스크랩
var setTCScrap = function () {
    var jqTCScrap = $('.jqTCScrap');

    if (jqTCScrap.size() == 0) {
        return false;
    }

    jqTCScrap.on('click', function () {
        window.open($(this).attr('href'), 'portalScrap', 'width=300,height=170');
        return false;
    });

};

// 오류신고
var setTCErrorLayerPopup = function () {
    var jqTCErrorLayerPopup	=	$('.jqTCErrorLayerPopup');

    jqTCErrorLayerPopup.on('click', function () {
        alert('오류신고 미구현');
        return false;
    });

};

// lnb button
/*
var setLnbButton = function () {
	var $current = $('#localNavigator li.current');

	if ($current.size() == 0) {
		return false;
	}

	var currentId = $current.data().menuId;
	var buttons = [
		// 공연,전시
		 '<a data-menu-ids="M_20141023140450176-A,M_20141023140450238" href="/culture/perfromForm.do"><img src="/images/portal/button/btnRegister01.jpg" alt="공연·전시 등록하기" /></a>'
		,'<a data-menu-ids="M_20141023140450176-B" href="/culture/perfromTicketForm.do"><img src="/images/portal/button/btnRegister02.jpg" alt="할인티켓 등록하기" /></a>'
		,'<a data-menu-ids="M_20141023140450378" href="/perform/reviewForm.do"><img src="/images/portal/button/btnRegister06.jpg" alt="관람후기 등록하기" /></a>'
		//,'<a data-menu-ids="" href="#"><img src="/images/portal/button/btnRegister03.jpg" alt="인디홍보 등록하기" /></a>'

		// 행사,교육
		,'<a data-menu-ids="M_20141023140450519,M_20141023140450581" href="/culture/festivalForm.do"><img src="/images/portal/button/btnRegister08.jpg" alt="축제·행사 등록하기" /></a>'
		,'<a data-menu-ids="M_20141023140450644" href="/culture/educationForm.do"><img src="/images/portal/button/btnRegister07.jpg" alt="교육정보 등록하기" /></a>'

		// 매거진
		,''//'<a data-menu-ids="M_20141023140450768,M_20141023140450831" href="http://coms.culture.go.kr" target="_blank"><img src="/images/portal/button/btnRegister05.jpg" alt="문화공감 등록하기" /></a>'

		// 미디어
		//,'<a data-menu-ids="M_20141023140450971,M_20141023140451034,M_20141023140451096" href="http://coms.culture.go.kr" target="_blank"><img src="/images/portal/button/btnRegister09.jpg" alt="문화영상 등록하기" /></a>'

		// 문화공간
		//,'<a data-menu-ids="M_20141023140451756" href="#"><img src="/images/portal/button/btnRegister10.jpg" alt="문화시설 등록하기" /></a>'
		,'<a data-menu-ids="M_20141023140451756" href="/culture/rentalForm.do"><img src="/images/portal/button/btnRegister13.jpg" alt="문화시설 등록하기" /></a>'
		,'<a data-menu-ids="M_20141023140451834" href="/culture/organizationForm.do"><img src="/images/portal/button/btnRegister11.jpg" alt="문화예술단체 등록하기" /></a>'

		// 이벤트
		,'<a data-menu-ids="M_20141023140452349" href="/culture/invitationForm.do"><img src="/images/portal/button/btnRegister04.jpg" alt="문화초대이벤트 등록하기" /></a>'
		,'<a data-menu-ids="M_20141023140452427,M_20141023140452490" href="/culture/eventForm.do"><img src="/images/portal/button/btnRegister12.jpg" alt="이벤트 등록하기" /></a>'
	];

	for (var i in buttons) {
		if (buttons[i].indexOf(currentId) == -1) {
			continue;
		}
		// M_20141023140450176-A,B 구분
		$('.jqLnbButtonBox').append( buttons[i] );
	}

	$('.jqLnbButtonBox a').on('click', function () {
		if ($(this).attr('target') == '_blank') {
			window.open( $(this).attr('href') );
			return false;
		}
		window.location.href = $(this).attr('href') + '?rurl=' + encodeURIComponent(window.location.href);
		return false;
	});
};
*/

// sitemap
var setSitemap = function () {
    var jqSitemapOpen	=	$('.jqSitemapOpen');
    var jqSitemap		=	$('.jqSitemap');
    var jqSitemapClose	=	$('.jqSitemapClose');

    if (jqSitemapOpen.size() == 0 || jqSitemap.size() == 0) {
        return false;
    }

    jqSitemapOpen.on('click', function () {
        jqSitemap.css({zIndex:999999}).fadeIn(300);
        jqSitemap.attr('tabIndex',0).focus();
        Layer.mask();
        return false;
    });

    jqSitemapClose.on('click', function () {
        jqSitemap.fadeOut(300);
        jqSitemapOpen.focus();
        Layer.unmask();
        return false;
    });

    /*
    $(window).scroll(function () {
        var top = 30;
        if ($(document).scrollTop() > 30) {
            top = $(document).scrollTop();
        } else {
            top = 30;
        }
        jqSitemap.stop().css({top : top});
    }).scroll();
    */
};

// 푸터배너
var setOrganBanner = function () {

    var $open = $('.jqOrganBannerOpen');
    var $wrap = $('.jqOrganBannerList');

    if ($open.size() == 0 || $wrap.size() == 0) {
        return false;
    }

    var $list = $wrap.find('ul');
    var $prev = $wrap.find('button:eq(0)');
    var $next = $wrap.find('button:eq(1)');
    var initHTML = false;

    if ($wrap.is(':visible')) {
        setOrganBannerHTML();
        initHTML = true;
    }

    $open.on('click', function (e) {
        e.preventDefault();
        if ($wrap.is(':visible')) {
            $wrap.slideUp(200);
            $open.find('img').attr('src', function () {
                return this.src.replace('https://www.culture.go.kr/error.jsp', 'https://www.culture.go.kr/error.jsp');
            });

        }
        if ($wrap.is(':hidden')) {

            if (initHTML == false) {
                setOrganBannerHTML();
                initHTML = true;
            }
            $wrap.slideDown(200);
            $wrap.attr('tabIndex',0).focus();
            $open.find('img').attr('src', function () {
                return this.src.replace('https://www.culture.go.kr/error.jsp', 'https://www.culture.go.kr/error.jsp');
            });
        }

    });
};

var setOrganBannerHTML = function () {

    $.ajax({
        url			:	'/mainbanner/list.do'
        ,type		:	'post'
        ,data		:	'sid=' + encodeURIComponent('관련기관 안내 배너').replace(/%/g, '%25')
        ,dataType	:	'json'
        ,success	:	function( res ) {

            if (res != null && res['관련기관 안내 배너'] != null) {
                var jo = res['관련기관 안내 배너'];
                var html = '';

                for (var i = 0; i < jo.length; i++) {
                    html += '<li>'
                        + '<a href="' + jo[i].link_url + '" target="_blank" title="새창열림">'
                        + '<img src="'+ jo[i].image_url +'" alt="'+ jo[i].title +'" /></a></li>';
                }

                html = '<ul style="margin-left:0px; width:999999px;">' + html + '</ul>';
                $('.jqOrganBannerListItem').html( html );
            }

        }
        //,error : function(data, status, err) {}
        //,beforeSend : function() {}
        ,complete : function() {

            var $wrap = $('.jqOrganBannerList');
            var $list = $wrap.find('ul');
            var $prev = $wrap.find('button:eq(0)');
            var $next = $wrap.find('button:eq(1)');

            if ($list.find('li').size() < 1) {
                return false;
            }

            // slide
            var _this	=	this;
            _this.no	=	1;

            var o		=	{
                max		:	parseInt(($list.find('li').size() + (8 - 1)) / 8)
                ,speed	:	300
                ,width	:	1080
                ,timer	:	true
            };

            if (o.max == 1) {
                $prev.hide();
                $next.hide();
                return false;
            }

            var _addNo = function () {
                var n = _this.no;
                if (n == o.max) {
                    n = 1;
                } else {
                    n += 1;
                }
                _this.no = n;
                return n;
            };
            var _minusNo = function () {
                var n = _this.no;
                if (n < 2) {
                    n = o.max;
                } else {
                    n -= 1;
                }
                _this.no = n;
                return n;
            };

            $list.css({position : 'relative'});

            $prev.on('click', function () {
                var posLeft = (_minusNo() - 1) * o.width * -1;
                $list.stop().animate({left : posLeft}, o.speed, 'easeInOutQuint');
            });
            $next.on('click', function () {
                var posLeft = (_addNo() - 1) * o.width * -1;
                $list.stop().animate({left : posLeft}, o.speed, 'easeInOutQuint');
            });
        }
    });

};

// 상단으로
var setGoTop = function () {
    var tBtn = $('a.btnTopLink');	// 상단
    var fBtn = $('a.btnTop');		// 하단 gotop

    if (tBtn.size() > 0) {
        tBtn.on('click', function () {
            scrollTop( $(this).attr('href') );
            return false;
        });

        $(window).scroll(function () {
            var limit = $(document).height() - ($('#allMenuWrap02').outerHeight() + $('#orgBanner').outerHeight() + $('#footerWrap').outerHeight() + 10 + 31);
            var top = 286;

            if ($(document).scrollTop() > limit) {
                tBtn.hide();
            } else {
                if ($(document).scrollTop() < (top - 10)) {
                    tBtn.hide();
                } else {
                    tBtn.css({top : 10}).show();
                }
            }
        }).scroll();
    }

    if (fBtn.size() > 0) {
        fBtn.on('click', function () {
            scrollTop( $(this).attr('href') );
            return false;
        });
    }
};

// 추천 검색어
var recomKeyword = function () {
    var keywords = $('.jqRecomKeyword a');
    var commonSearchFrm = $('form[name=commonSearchFrm]');
    if (keywords.size() == 0 || commonSearchFrm.size() == 0) {
        return false;
    }
    keywords.on('click', function () {
        commonSearchFrm.find('input[type=text]:eq(0)').val( $.trim($(this).text()) );
        commonSearchFrm.submit();
        return false;
    });
};

//no image
var setImage404 = function () {

    $('img').error(function () {
        $(this).data('old', $(this).attr("src"));
        $(this).attr('src', '../images/portal/layout/noimage.jpg');
    }).each(function() {
        $(this).attr("src", $(this).attr("src"));
    });

};

// layout 관련
$(function () {

    setGnb();					// gnb
    setLogin();					// login
    setPlaceholderAuto();		// placeHolder

    setTCShareSNS();			// SNS공유
    setTCPrint();				// 프린트
    setTCScrap();				// 스크랩 레이어팝업
    setTCErrorLayerPopup();		// 오류신고 레이어팝업
    setSitemap();				// 사이트맵
    recomKeyword();				// 추천 검색어 클릭

    //setLnbButton();				// lnb버튼
    setOrganBanner();			// footer 관련기관배너
    setGoTop();					// go top

    //setImage404();				// no image
    setStyle();						// css style

    $('.skipNav').attr('href','#content'); 		// skip navi 경로 변경
});



var setDateFormat = function(date, gubun, val) {
    var result = '';
    var dateArr = date.split('-');
    var dat = new Date();
    var dat_y, dat_m, dat_d;

    switch(gubun) {
        case 'week':
            dat.setDate(dat.getDate()+val);
            break;
        case 'month':
            dat.setMonth(dat.getMonth()+val);
            break;
        case 'year':
            dat.setFullYear(dat.getFullYear()+val);
            break;
    }

    dat_y = dat.getFullYear();
    dat_m = (dat.getMonth()+1).toString().length < 2 ? '0'+(dat.getMonth()+1):(dat.getMonth()+1);
    dat_d = (dat.getDate().toString().length < 2 ? '0'+dat.getDate():dat.getDate());

    result = dat_y+'-'+dat_m+'-'+dat_d;
    return result;
};

//footer 영역 관련사이트 이동
function goRelSite(url){
    if( url != "" ){
        window.open(url);
    }
}

var getStrParam = function(val) {
    var params = new Object();
    var datas = val.slice(val.indexOf('?')+1).split('&');
    $.each(datas, function(i) {
        var arr = datas[i].split('=');
        params[arr[0]] = arr[1];
    });
    return params;
}

$(function(){
    $('.sortingList li').children().attr('title', '선택안됨');
    $('.sortingList li.on').children().attr('title', '선택됨');
});