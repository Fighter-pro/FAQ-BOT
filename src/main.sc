require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        buttons:
            {text: "Личный кабинет", url: "https://marketplace-admin.letoile.tech/claims/supply-requests/"}
            {text: "Сайт LETU.RU", url: "https://www.letu.ru/product/l-kudri-naturalnyi-konditsioner-dlya-kudryavyh-volos-normalnyh-i-zhirnyh/124100598"}
            "Дальше" -> /Step 1
        a: Привет, меня зовут Тихон и я бот технической поддержки.
        event: noMatch || toState = "./"

    state: Step 1
        event: noMatch || toState = "/NewState_2"
        InputPhoneNumber: 
            prompt = Просим указать Ваш номер телефона для связи.
            varName = Mphone
            html = 
            htmlEnabled = false
            failureMessage = [""]
            failureMessageHtml = [""]
            then = /Step 1_2
            actions = {}

    state: NewState_2