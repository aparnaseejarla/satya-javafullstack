async function CreateWhatsappChatWidget(
  option = {
    brandSetting: {
      autoShow: true,
      backgroundColor: '#0a6114',
      borderRadius: '25',
      brandImg: 'https://cdn.clare.ai/wati/images/WATI_logo_square_2.png',
      brandImgData: null,
      brandName: 'WATI',
      brandSubTitle: '',
      ctaText: 'Chat with us',
      welcomeText: 'I have some questions about Wati, \ncan you help?',
      messageText: 'I’ve some questions about Wati, can you help?',
      phoneNumber: '85252859384',
    },
    chatButtonSetting: {
      backgroundColor: '#00E785',
      borderRadius: '25',
      ctaText: 'Chat with us',
      marginLeft: '0',
      marginRight: '20',
      marginBottom: '20',
      position: 'right',
    },
    enabled: false,
  }
) {
  if (option.enabled == false) {
    return;
  }
  if (!option.chatButtonSetting.position) {
    option.chatButtonSetting.position = 'right';
    option.chatButtonSetting.marginBottom = '20';
    option.chatButtonSetting.marginLeft = '0';
    option.chatButtonSetting.marginRight = '20';
  }
  var css = document.createElement('STYLE');

  initWidget();
  function initWidget() {
    if (option.brandSetting.messageText) {
      option.brandSetting.messageText = option.brandSetting.messageText.replaceAll(
        '{{page_link}}',
        encodeURIComponent(window.location.href)
      );
      option.brandSetting.messageText = option.brandSetting.messageText.replaceAll(
        '__page_link__',
        encodeURIComponent(window.location.href)
      );
      option.brandSetting.messageText = option.brandSetting.messageText.replaceAll(
        '{{page_title}}',
        window.document.title
      );
      option.brandSetting.messageText = option.brandSetting.messageText.replaceAll(
        '__page_title__',
        window.document.title
      );
      option.brandSetting.messageText = option.brandSetting.messageText.replaceAll('\n', '%0A');
    }

   
    if (option.brandSetting.autoShow) {
      document.querySelector('.wa-chat-box').style.display = 'block';
    } else {
      document.querySelector('.wa-chat-box').style.display = 'none';
    }
    document.querySelector('#whatsapp-chat-widget').addEventListener('click', function (event) {
      console.log('event', event);
      if (event.target.classList.contains('wa-chat-bubble-close-btn')) {
        document.querySelector('.wa-chat-box').style.display = 'none';
      }
      if (event.target.id === 'wa-widget-send-button') {
        document.querySelector('.wa-chat-box').style.display = 'block';
      }
    });
  }

  var styles = `
        #whatsapp-chat-widget{
            display: ${option.enabled ? 'block' : 'none'}
        }
        .wa-chat-box-content-send-btn-text{
            margin-left: 8px;
            margin-right: 8px;
            z-index: 1;
            color: rgb(255, 255, 255);
        }
        .wa-chat-box-content-send-btn-icon{
            width: 16px;
            height: 16px;
            fill: rgb(255, 255, 255);
            z-index: 1;
            flex: 0 0 16px;
        }
        .wa-chat-box-content-send-btn{
            text-decoration: none;
            color: rgb(255, 255, 255)!important;
            font-size: 15px;
            font-weight: 700;
            line-height: 20px;
            cursor: pointer;
            position: relative;
            display: flex;
            -webkit-box-pack: center;
            justify-content: center;
            -webkit-box-align: center;
            align-items: center;
            -webkit-appearance: none;
            padding: 8px 12px;
            border-radius: ${option.brandSetting.borderRadius}px;
            border-width: initial;
            border-style: none;
            border-color: initial;
            border-image: initial;
            background-color: ${option.chatButtonSetting.backgroundColor}!important;
            margin: 20px;
            overflow: hidden;
        }
        .wa-chat-box-send{
            background-color:white;

        }
        .wa-chat-box-content-chat-brand{        
            font-size: 13px;
            font-weight: 700;
            line-height: 18px;
            color: rgba(0, 0, 0, 0.4);
        }
        .wa-chat-box-content-chat-welcome{        
            font-size: 14px;
            line-height: 19px;
            margin-top: 4px;
            color: rgb(17, 17, 17);
        }
        .wa-chat-box-content-chat{
            background-color: white;
            display: inline-block;
            margin: 20px;
            padding: 10px;
            border-radius: 10px;
        }
        .wa-chat-box-content{
            background: url('https://user-images.githubusercontent.com/99333830/277576700-059390fb-4890-40dc-8a77-34942ff2e9db.png');
            
        }
        .wa-chat-bubble-close-btn{
            cursor: pointer;
            position: absolute;
            right: 20px;
            top: 20px;           
        }
        .wa-chat-bubble-close-btn img {
            pointer-events: none;
        }
        .wa-chat-box-brand-text{
            margin-left: 20px;
        }
        .wa-chat-box-brand-name{
            font-size: 16px;
            font-weight: 700;
            line-height: 20px;
        }
        .wa-chat-box-brand-subtitle{
            font-size: 13px;
            line-height: 18px;
            margin-top: 4px;
        }
        
        .wa-chat-box-header{
            height: 100px;
            max-height: 100px;
            min-height: 100px;
            background-color: ${option.brandSetting.backgroundColor};
            color: white;
            border-radius: 10px 10px 0px 0px;
            display:flex;
            align-items: center;
        }
        .wa-chat-box-brand{
            margin-left: 20px;
            width: 50px;
            height: 50px;
            border-radius: 25px;
            box-shadow: 2px 2px 6px rgba(0,0,0,0.4);
        }
        .wa-chat-box{
            background-color:white;
            z-index: 16000160 !important;
            margin-bottom: 60px;
            width: 360px;
            position: fixed !important;
            bottom: ${option.chatButtonSetting.marginBottom}px !important;
            ${option.chatButtonSetting.position == 'left'
      ? 'left : ' + option.chatButtonSetting.marginLeft + 'px'
      : 'right : ' + option.chatButtonSetting.marginRight + 'px'
    };
            border-radius: 10px;
            box-shadow: 2px 2px 6px rgba(0,0,0,0.4);
            font: 400 normal 15px/1.3 -apple-system, BlinkMacSystemFont, Roboto, Open Sans, Helvetica Neue, sans-serif;
        }
        #wa-widget-send-button {
            margin: 0 0 ${option.chatButtonSetting.marginBottom}px 0 !important;      
            padding-left: ${option.chatButtonSetting.ctaText ? '15px' : '0px'};
            padding-right: ${option.chatButtonSetting.ctaText ? '15px' : '0px'};
            position: fixed !important;
            z-index: 16000160 !important;
            bottom: 0 !important;
            text-align: center !important;
            height: 50px;
            min-width: 50px;
            border-radius: ${option.chatButtonSetting.borderRadius}px;
            visibility: visible;
            transition: none !important;
            background-color: ${option.chatButtonSetting.backgroundColor};
            box-shadow: 2px 2px 6px rgba(0,0,0,0.4);
            ${option.chatButtonSetting.position == 'left'
      ? 'left : ' + option.chatButtonSetting.marginLeft + 'px'
      : 'right : ' + option.chatButtonSetting.marginRight + 'px'
    };
            cursor: pointer;
            display: flex;
            align-items: center;
            justify-content:center;
        }
        .wa-messenger-svg-whatsapp{
            fill: white;
            width: 41px;
            height: 50px;
            stroke: none;
            pointer-events: none;
        }
        .wa-chat-box-poweredby{
            text-align: center;
            font: 400 normal 15px/1.3 -apple-system, BlinkMacSystemFont, Roboto, Open Sans, Helvetica Neue, sans-serif;
            margin-bottom: 15px;
            margin-top: -10px;
            font-style: italic;
            font-size: 12px;
            color: lightgray;
        }
        @media only screen and (max-width: 600px) {
            .wa-chat-box
            {
                width: auto;
                position: fixed !important;
                right: 20px!important;
                left: 20px!important;
            }
        }
    `;

  var styleSheet = document.createElement('style');
  styleSheet.innerText = styles;
  document.getElementsByTagName('head')[0].appendChild(styleSheet);
}