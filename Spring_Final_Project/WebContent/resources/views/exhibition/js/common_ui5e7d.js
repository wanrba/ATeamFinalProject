$(document).ready(function(){
	
	//gnb
	var gnb = $("#gnb li");
	var gnb_wrap = $("#gnb");
	function gnbOpen(){
		$(gnb_wrap).css({height:"304px"});
		$('.gnb_overlay').show();
	}
	$(gnb).bind('mouseover focusin', function(){
	  $(this).addClass("on").parent().siblings().find("a").removeClass("on");
	  gnbOpen();
	});		
	$(gnb).bind('mouseout focusout', function(){
	  $(this).removeClass("on");
	});		
	$(gnb_wrap).each(function(){
		  $(this).bind('mouseleave focusout', function(){
		  $(this).css({height:"60px"});
		  $('.gnb_overlay').hide();
		});	
	});

 	//nav_mobile
	$(function(){
	var sidePenal, 
		penalTrigger,
		penalClose,
		dimmyBackground,
		sidePenal = $(".aside_nav"),
		penalTrigger = $(".aside_trigger"),
		penalClose = $span(),
		dimmyBackground = $div();
		$(penalClose) 
			.addClass("penal_close")
			.prependTo(sidePenal);

		$(dimmyBackground)
			.addClass("dim_overlay")
			.insertAfter(sidePenal);

		$(penalTrigger).click(function(){
			 $(sidePenal).addClass("open");
			 $(dimmyBackground).fadeIn("slow");
		});
		$(penalClose).click(function(){
			$(sidePenal).removeClass("open");
			$(dimmyBackground).fadeOut("slow");
		});
		$(dimmyBackground).click(function(){
			$(sidePenal).removeClass("open");
			$(dimmyBackground).fadeOut("slow");
		});
		function $div(){
			return document.createElement("div");
		}
		function $span(){
			return document.createElement("span");
		}
	});

	//allmenu
	$('.all_menu').click(function(){
		if (!$(this).hasClass('on'))
		{
			$(".allmenu_wrap").animate({height: "toggle"},300);
			$(this).addClass('on');
			$(".all_menu em").html('전체메뉴 닫기');
		}else{
			$(".allmenu_wrap").animate({height: "toggle"},300);
			$(this).removeClass('on');
			$(".all_menu em").html('전체메뉴 펼쳐보기');
		}
		return false;
	});

	//search
	$('.total_search').click(function(){
		if (!$(this).hasClass('on'))
		{
			$(".search_wrap").animate({height: "toggle"},300);
			$(this).addClass('on');
		}else{
			$(".search_wrap").animate({height: "toggle"},300);
			$(this).removeClass('on');
		}
		return false;
	});

	//asidemenu	
	$('.btn_aside').click(function(){
	   if (!$(this).hasClass('on'))
	   {
	      $("#aside_lnb").animate({height: "toggle"},300);
	      $(this).addClass('on');
	      $(".btn_aside span").html('메뉴닫기');
	   }else{
	      $("#aside_lnb").animate({height: "toggle"},300);
	      $(this).removeClass('on');
	      $(".btn_aside span").html('메뉴펼쳐보기');
	   }
	   return false;
	});
	$('.lnb_list > li > ul').parent().addClass('depth');
	var ltc = $('.lnb_list > li');
	   ltc.addClass('hid');
	$('.lnb_list > li > a').click (function(e) {
	   var ltcm = $(this).parents('.lnb_list > li:first');

	   if($(this).parent().hasClass('depth')) { // 2019.01.18 김현준추가
	      if (ltcm.hasClass('hid')) {
	         ltc.addClass('hid').removeClass('active').find('ul').slideUp(150);
	         ltcm.removeClass('hid').addClass('active').find('ul').slideDown(150);
	      } else {
	         ltcm.removeClass('active').addClass('hid').find('ul').slideUp(150);
	      }
	   } else { // 2019.01.18 김현준 추가
	      var linkUrl = $(this).attr('href');
	      $(location).attr('href',linkUrl);
	   }

	   return false;
	});

	//nav	
	$('.nav_list > li > ul').parent().addClass('depth');
	var atc = $('.nav_list > li');
	   atc.addClass('hid');
	$('.nav_list > li > a').click (function() {
	   var atcm = $(this).parents('.nav_list > li:first');

	   if($(this).parent().hasClass('depth')) { // 2019.01.21 김현준추가
	      if (atcm.hasClass('hid')) {
	         atc.addClass('hid').removeClass('active').find('ul').slideUp(150);
	         atcm.removeClass('hid').addClass('active').find('ul').slideDown(150);
	      } else {
	         atcm.removeClass('active').addClass('hid').find('ul').slideUp(150);
	      }
	   } else { // 2019.01.21 김현준 추가
	      var linkUrl = $(this).attr('href');
	      $(location).attr('href',linkUrl);
	   }

	   return false;
	});

	//tab
	var $tabsNav    = $('.tabs'),
		$tabsNavLis = $tabsNav.children('li'),
		$tabContent = $('.cont');
	$tabsNav.each(function() {
		// mobileMenu에서 직접 변경
		// var $this = $(this);
		// $this.next().children('.cont').stop(true,true).hide().first().show();
		// $this.children('li').first().addClass('on').stop(true,true).show();
	});
	$tabsNavLis.on('click', function(e) {
		var $this = $(this);
		$this.siblings().removeClass('on').end().addClass('on');
		$this.parent().next().children('.cont').stop(true,true).hide().siblings( $this.find('a').attr('href') ).fadeIn(0);
		e.preventDefault();
	});

	$('.caution_txt,.tooltip_txt').click(function(){
		if($(this).hasClass('on')){
			$('.caution_info,.tooltip').removeClass('on')
			$(this).removeClass('on')
		}else{
			$(this).addClass('on')
			$('.caution_info,.tooltip').addClass('on')
		}
	});

	$('.detail_cont .more').click(function(){
		if (!$(this).hasClass('on'))
		{
			$(".detail_cont .cont").addClass('on');
			$(this).addClass('on');
			$(".detail_cont .more span").html('닫기');
		}else{
			$(".detail_cont .cont").removeClass('on');
			$(this).removeClass('on');
			$(".detail_cont .more span").html('더보기');
		}
		return false;
	});

	$('.trad_group a[href*="#"]').on('click', function (e) {
	    e.preventDefault();
	    $('html, body').animate({
	        scrollTop: $($(this).attr('href')).offset().top
	    }, 300, 'linear');
	});
	$('.trad_group .subject_tab li,.date_list li').on('click', function(){
	    $(this).addClass('on').siblings().removeClass('on');
	});
	$('.trad_group .subject_tab1 li,.date_list li').on('click', function(){
		$(this).addClass('on').siblings().removeClass('on');
	});
	$('.period_wrap .period').click(function(){
	   if (!$(this).hasClass('on'))
	   {
	      $(".period_select").slideDown(300);
	      $(this).addClass('on');
	      $(".period span").html('기간상세검색닫기');
	   }else{
	      $(".period_select").slideUp(300);
	      $(this).removeClass('on');
	      $(".period span").html('기간상세검색펼쳐보기');
	   }
	   return false;
	});
	$('.date_list li a,.period_select .btn_apply').on('click', function(){
	    $(".period_select").slideUp(300);
	    $(".period_wrap .period").removeClass('on');
	    $(".period span").html('상세검색펼쳐보기');
	});

	$('.source_wrap .source').click(function(){
	   if (!$(this).hasClass('on'))
	   {
	      $(".source_select").slideDown(300);
	      $(this).addClass('on');
	      $(".source span").html('출처선택닫기');
	   }else{
	      $(".source_select").slideUp(300);
	      $(this).removeClass('on');
	      $(".source span").html('출처선택펼쳐보기');
	   }
	   return false;
	});
	$('.source_select .btn_search').on('click', function(){
	    $(".source_select").slideUp(300);
	    $(".source_wrap .source").removeClass('on');
	    $(".source span").html('출처선택펼쳐보기');
	});

	//qna
	var ftc = $('.qna_list li');
	   	ftc.addClass('hid');
	$('.qna_list li a').click (function() {
		if($(this).hasClass("not_title") === false){
			var ftcm = $(this).parents('.qna_list li:first');
			if(ftcm.hasClass('hid')) {
				ftc.addClass('hid').removeClass('active').find('div').slideUp(150);
				ftc.children('a').attr('title',  '답변 열기')
				ftcm.removeClass('hid').addClass('active').find('div').slideDown(150);
				ftcm.children('a').attr('title',  '답변 닫기')
			} else {
				ftcm.removeClass('active').addClass('hid').find('div').slideUp(150);
				$(this).attr('title',  '답변 열기')
			}
			return false;
		}

	});

	//페이지 공유
	$('.content_link .share_wrap').bind('mouseenter focusin', function(){
		$('.share_list').addClass('opened');
	});
	$('.content_link .share_wrap').bind('mouseleave', function(){
		$('.share_list').removeClass('opened');
	});

	//관련기관안내
	$('.organ_guide').click(function(){
		$('.organ_banner').slideToggle(300);
	});

	//main
	$('.area_view').click(function(){
	   if (!$(this).hasClass('on'))
	   {
	      $(".area_list_wrap").slideDown(300);
	      $(this).addClass('on');
	   }else{
	      $(".area_list_wrap").slideUp(300);
	      $(this).removeClass('on');
	   }
	   return false;
	});
	$('.area_list_wrap .area_close').on('click', function(){
	    $(".area_list_wrap").slideUp(300);
	    $(".area_view").removeClass('on');
	});

	var atc = $('.loca_list > li');
	    atc.addClass('hid');
	$('.loca_list > li > a').click (function() {
	   var atcm = $(this).parents('.loca_list > li:first');
	   if(atcm.hasClass('hid')) {
	      atc.addClass('hid').removeClass('active').find('ul').slideUp(150);
		   atc.children('a').removeAttr('title')
	      atcm.removeClass('hid').addClass('active').find('ul').slideDown(150);
		   atcm.children('a').prop('title', '선택됨')
	   } else {
	      atcm.removeClass('active').addClass('hid').find('ul').slideUp(150);
		   atcm.children('a').removeAttr('title')
	   }
	   return false;
	});

	$('.sympathy dt a,.place dt a').click(function() {
		$(this).parent('dt').addClass('on').siblings('dt').removeClass('on');
		return false;
	});

	//search
	$(function(){
		var slideHeight = 110;
		var defHeight = $('.option_list').height();
		if(defHeight >= slideHeight){
			$('.option_list').css('height' , slideHeight + 'px');
			$('.option_more').click(function(){
				var curHeight = $('.option_list').height();
				if(curHeight == slideHeight){
					$('.option_list').animate({height:defHeight});
					$(this).html('접기');
				}else{
					$('.option_list').animate({height:slideHeight});
					$(this).html('더보기');
				}
				return false;
			});
		}
	});
});

// modal popup
$(function () {
	$('.modal_wrap.show').each(function () {
		modalOpen($(this), null);
	});
});
var modalOpener = null;
$(document).on('click', 'a.modal_open', function (e) {
	var tg = $(this).attr('href');
	modalOpen(tg, $(this));
	e.preventDefault();
}).on('click', '.modal_close', function () {
	var target = $(this).closest('.modal_wrap').attr('id');
	modalClose('#' + target, modalOpener);
}).on('keydown', '.modal_wrap .btn_close_modal', function (e) {
	if (e.keyCode == 9 && !e.shiftKey) { // tab
		e.preventDefault();
		$(this).siblings('.modal_title').attr('tabindex', '0').focus();
	}
}).on('keydown', '.modal_title', function (e) {
	if (e.keyCode == 9 && e.shiftKey) { // shift + tab
		e.preventDefault();
		$(this).siblings('.btn_close_modal').focus();
	}
});
function modalOpen(_target, _opener) {
	modalOpener = _opener;
	$(_target).fadeIn('fast').addClass('show').find('.modal_title').attr('tabindex', '0').focus();
	bodyScroll(true, $('body').width());		
}
function modalClose(_target, _opener) {
	bodyScroll(false);
	var tg = null;
	if (_opener) {
		tg = $(_target);
		modalOpener = $(_opener);
	} else {
		tg = $('.modal_wrap.show');
		modalOpener = null;
	}
	$(tg).hide().removeClass('show');
	if (modalOpener !== null) {
		modalOpener.focus();
		modalOpener = null;
	}
}
function bodyScroll(_status, _orgWidth) {
	var $fixedObj = $('body');
	if (_status) {
		$('body').addClass('modal_opened');
		if ($('html').get(0).scrollWidth > $('html').width() === false) {
			$fixedObj.css('margin-right', $('body').width() - _orgWidth);
		}
	} else {
		$fixedObj.css('margin-right', '');
		$('body').removeClass('modal_opened');
	}
}