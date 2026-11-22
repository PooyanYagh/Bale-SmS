# Bale-SMS

> An independent Bale Bot API adaptation of Telegram-SMS for Android 6.0 and later.

Bale-SMS forwards SMS messages and call/battery events from an Android device to an
authorized [Bale](https://bale.ai/) bot chat. It is derived from
[telegram-sms/telegram-sms](https://github.com/telegram-sms/telegram-sms) and retains
the upstream BSD 3-Clause license and notices.

## Important security notes

- Configure a dedicated Bale bot token and an authorized chat ID in the app; never
  commit either value to this repository.
- SMS forwarding and remote commands expose private device data. Only authorize a
  chat you control and protect the device with a screen lock.
- The app requires sensitive Android permissions to read/forward SMS and call events.

<div align="center">
<img src="https://github.com/user-attachments/assets/7a283d15-52fe-42cd-a782-4984427db234" alt="Bale-SMS">
</div>

![Min Android Version](https://img.shields.io/badge/Min%20Android%20Version-6.0-orange.svg?style=flat-square)
[![License](https://img.shields.io/badge/License-BSD%203--Clause-blue.svg?style=flat-square)](https://github.com/telegram-sms/telegram-sms/blob/master/LICENSE)
[![GitHub Releases](https://img.shields.io/github/downloads/telegram-sms/telegram-sms/latest/app-release.apk?style=flat-square)](https://github.com/telegram-sms/telegram-sms/releases/latest)
![GitHub Sponsors](https://img.shields.io/github/sponsors/qwe7002?style=flat-square)


## News, Questions and Contributions

You can follow the Telegram channel Telegram SMS Change Log for the latest news. [English](https://t.me/tg_sms_changelog_eng), [简体中文](https://t.me/tg_sms_changelog)

**For bug reports and feature requests, please use this repository's GitHub Issues.**

The primary language used for commit messages is Simplified Chinese. However, you're welcome to use English in commit messages when making contributions.

The original Telegram-SMS configuration website is not used by Bale-SMS.

## Get the Right Version

**Warning**: Bale-SMS uses its own Android application ID, so it can be installed alongside Telegram-SMS. Release APK signing and update compatibility depend on the signing key used for a release.

[Latest Release Download](https://github.com/telegram-sms/telegram-sms/releases/latest)

[Pre-release Version](https://github.com/telegram-sms/telegram-sms-nightly)

**NO WARRANTY EXPRESSED OR IMPLIED. USE AT YOUR OWN RISK!**

**[Telegram SMS compat](https://github.com/telegram-sms/telegram-sms-compat)** - For older Android devices (Android 5.0 or lower). [![Github Release](https://img.shields.io/github/downloads/telegram-sms/telegram-sms-compat/latest/app-release.apk?style=flat-square)](https://github.com/telegram-sms/telegram-sms-compat/releases/latest)


## Features

- Forward SMS text messages to Bale as a bot;
- Notification regarding missed or incoming calls;
- Notification regarding device battery power changes;
- Carbon Copy - a new way to configure the forward destination(e.g. bark, pushdeer, gotify, etc.).
- Remote control via chat command or SMS.
- Configure the Bale Bot API address, token, and authorized chat ID.

The default Bot API base address is `https://tapi.bale.ai`.

## Permission

This app requires following permissions to work properly:

- SMS: To read and send text messages.
- Phone: Check whether it is a dual SIM-Card phone, the SIM status and its identification digits.
- Call phone: Execute the USSD code.
- Call log: Read incoming numbers.
- Camera: Scan the QR code and quickly enter the Bot Token.
- Notification access: Listen for notification messages.

You can set this APP as the default SMS APP, which will stop popping up SMS notifications and set all received SMS as "read" on the phone.

## User Manual

- [English](https://telegram-sms.com/user-manual.html)
- [简体中文](https://telegram-sms.com/zh_cn/user-manual.html)
- [繁體中文](https://telegram-sms.com/zh_tw/user-manual.html)
- [日本語](https://telegram-sms.com/ja_jp/user-manual.html)
- [Español](https://telegram-sms.com/es_es/user-manual.html)
- [Русский](https://telegram-sms.com/ru_ru/user-manual.html)

## Licenses

Telegram-SMS is licensed under [BSD 3-Clause License](https://get.telegram-sms.com/license).

[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Fqwe7002%2Ftelegram-sms.svg?type=large)](https://app.fossa.io/projects/git%2Bgithub.com%2Fqwe7002%2Ftelegram-sms?ref=badge_large)

CodeauxLib is licensed under [BSD 3-Clause License](https://github.com/telegram-sms/telegram-sms/blob/master/codeauxlib-license/LICENSE).

Artwork Use free fonts licensed by the whole society: [Refrigerator Deluxe](https://fonts.adobe.com/fonts/refrigerator-deluxe) [站酷庆科黄油体](https://www.zcool.com.cn/work/ZMTg5MDEyMDQ=.html)

Copyright of the artwork belongs to [@walliant](https://www.pixiv.net/member.php?id=5600144). Licensed under [CC BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/).

Download resource file: [Google Drive](https://drive.google.com/drive/folders/1Rg_MaJk0dnIN5GtKKmfvHPPCxjys8A0A?usp=drive_link)

Character set：

- Name: Fay (菲, フェイ)
- Type: Gynoid
- Birthday: 1st October, 2018
- Zodiac sign: Libra
- Habits: Eat sweets, Maid dress, Listen Heavy metal music

## Acknowledgements

This APP uses the following open source libraries:

- [okhttp](https://github.com/square/okhttp)
- [Gson](https://github.com/google/gson)
- [CodeauxLib](https://github.com/telegram-sms/CodeauxLibPortable)
- [AwesomeQRCode](https://github.com/SumiMakito/AwesomeQRCode)
- [code-scanner](https://github.com/yuriy-budiyev/code-scanner)
- [MMKV](https://github.com/Tencent/MMKV)

The creation of this APP would not be possible without the help from the following people:

- [@SumiMakito](https://github.com/SumiMakito) ([Donate](https://paypal.me/makito))
- [@zsxsoft](https://github.com/zsxsoft)
- [@walliant](https://www.pixiv.net/member.php?id=5600144) ([weibo](https://www.weibo.com/p/1005053186671274))

I would also like to thank the following people for their hard work to localise this project:

- English
    - [@tangbao](https://github.com/tangbao)
    - [@jixunmoe](https://github.com/jixunmoe) ([Donate](https://paypal.me/jixun))
    - [@ous50](https://github.com/ous50)
- Japanese
    - [@Lollycc](https://github.com/lollycc)
    - [@AisakaMk2](https://github.com/AisakaMk2)
    - [@Qiaogun](https://github.com/Qiaogun)
- Spanish
    - [@David Alonso](https://github.com/lpdavidgc)
- Chinese(Traditional)
    - [@lm902](https://github.com/lm902)
    - [@孟武尼德霍格龍](https://github.com/tony8077616)
- Cantonese (Simp./Trad.) (Remember: these translations are only available when the locale is set/fallbacked to 粵語（香港）or 粤语（中华人民共和国） )
    - [@ous50](https://github.com/ous50)

This APP uses the following public DNS service:

- [1.1.1.1](https://1.1.1.1/)

And finally, [sm.ms](https://sm.ms) for hosting images used in this page.

## Buy me a cup of coffee to help maintain this project further?

- [via Github](https://get.telegram-sms.com/donate/github)

Your donation will make me work better for this project.

## Contributors
<a href="https://github.com/telegram-sms/telegram-sms/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=telegram-sms/telegram-sms" alt="Contributors" />
</a>

Made with [contrib.rocks](https://contrib.rocks).

Made with ❤ in Palo Alto
