# Bale-SMS

[![Android 6.0+](https://img.shields.io/badge/Android-6.0%2B-3DDC84?logo=android&logoColor=white)](https://developer.android.com/about/versions/marshmallow)
[![License: BSD-3-Clause](https://img.shields.io/badge/License-BSD--3--Clause-blue.svg)](LICENSE)

**فارسی** | [English](#english)

## Bale-SMS چیست؟

Bale-SMS برنامه‌ای برای یک گوشی اندرویدی دارای سیم‌کارت است که پیامک‌های دریافتی را به ربات شخصی شما در پیام‌رسان بله می‌فرستد. برای نمونه، اگر یک گوشی دوم یا یک خط کاری دارید که همیشه کنارتان نیست، می‌توانید پیامک‌های آن را در بله ببینید.

> این برنامه فقط باید برای دستگاه، سیم‌کارت و رباتی استفاده شود که مالک آن‌ها هستید یا اجازهٔ صریح استفاده از آن‌ها را دارید.

## دانلود و نصب

[**دانلود آخرین نسخه**](https://github.com/PooyanYagh/Bale-SmS/releases/latest)

دانلود مستقیم نسخهٔ 1.0.0: [Bale-SMS-v1.0.0.apk](https://github.com/PooyanYagh/Bale-SmS/releases/download/v1.0.0/Bale-SMS-v1.0.0.apk)

1. فایل APK را از صفحهٔ Release دانلود کنید.
2. آن را روی گوشی دارای سیم‌کارت نصب کنید. اندروید ممکن است برای نصب از مرورگر یا فایل‌منیجر، مجوز «Install unknown apps» بخواهد.
3. برنامه را باز کنید و مجوزهای درخواستی را فقط در صورت نیاز تأیید کنید.

حداقل نسخهٔ پشتیبانی‌شده: **Android 6.0 (API 23)**.

## راه‌اندازی سریع

1. در بله یک ربات بسازید و **Bot Token** آن را دریافت کنید. راهنمای رسمی: [docs.bale.ai](https://docs.bale.ai/).
2. در بله به ربات خود پیام بدهید؛ برای نمونه `/start`.
3. در Bale-SMS مقدار Bot Token را وارد کنید.
4. از گزینهٔ **Get recent chat ID** در برنامه استفاده کنید و Chat ID گفت‌وگوی خودتان را انتخاب کنید؛ سپس تنظیمات را ذخیره کنید.
5. در صورت نیاز، آدرس API را روی مقدار پیش‌فرض `tapi.bale.ai` نگه دارید.
6. برای اطمینان، یک پیامک آزمایشی به گوشی بفرستید و رسیدن آن به بله را بررسی کنید.

## امکانات

- انتقال پیامک‌های دریافتی به ربات بله؛ این قابلیت روی دستگاه واقعی آزمایش شده است.
- ارسال اعلان تماس و رویدادهای باتری، مشروط به مجوزهای اندروید و سازگاری دستگاه.
- پشتیبانی از پیامک فارسی، Unicode و پیامک‌های چندبخشی.
- پشتیبانی از دو سیم‌کارت در بخش‌های پشتیبانی‌شدهٔ اندروید.
- امکان دریافت فرمان از گفت‌وگوی مجاز؛ فرمان‌های حساس نیازمند تنظیم و تأیید هستند.
- تلاش مجدد ارسال هنگام خطای شبکه.

### وضعیت آزمون v1.0.0

| قابلیت | وضعیت |
| --- | --- |
| ارسال پیامک دریافتی به بله | **تأییدشده روی دستگاه واقعی** |
| اتصال و ارسال پیام از طریق Bale Bot API | **تأییدشده** |
| اعلان تماس، فرمان از راه دور، USSD، چندسیم‌کارته و پایداری پس از راه‌اندازی مجدد | **نیازمند آزمون بیشتر** |

## مجوزها و حریم خصوصی

برای عملکردهای انتخابی برنامه، مجوزهایی مانند SMS، وضعیت تلفن، گزارش تماس، اعلان‌ها، اینترنت و اجرای پس‌زمینه لازم است. متن پیامک و اطلاعات رویدادها برای ارسال به ربات بله‌ای که خودتان پیکربندی می‌کنید استفاده می‌شود.

- Bot Token مانند گذرواژه است؛ آن را در تصویر، Issue، پیام عمومی یا مخزن Git قرار ندهید.
- فقط Chat ID خودتان را مجاز کنید.
- پیش از واگذاری یا فروش گوشی، تنظیمات برنامه و داده‌های آن را پاک کنید.
- برای اجرای پایدار، ممکن است لازم باشد محدودیت بهینه‌سازی باتری برنامه را در تنظیمات گوشی کاهش دهید.

## گزارش خطا و مشارکت

برای گزارش خطا یا پیشنهاد، لطفاً یک [Issue](https://github.com/PooyanYagh/Bale-SmS/issues) باز کنید و مدل گوشی، نسخهٔ اندروید، مراحل بازتولید و لاگِ بدون اطلاعات حساس را بنویسید. Pull Request نیز خوش‌آمد است.

## اعتبار و مجوز

Bale-SMS اقتباسی مستقل از پروژهٔ [Telegram-SMS](https://github.com/telegram-sms/telegram-sms) است که برای استفاده از Bale Bot API سازگار شده است. حقوق نویسندگان اصلی و متن کامل مجوز [BSD 3-Clause](LICENSE) حفظ شده‌اند.

---

<a id="english"></a>

## English

### What is Bale-SMS?

Bale-SMS is an Android app for a phone with a SIM card. It forwards incoming SMS messages to your personal bot on Bale. It is useful for a second phone or work line that is not always with you.

Use it only with devices, SIM cards, and bots that you own or are explicitly authorized to use.

### Download and install

[**Download the latest release**](https://github.com/PooyanYagh/Bale-SmS/releases/latest)

Direct download for v1.0.0: [Bale-SMS-v1.0.0.apk](https://github.com/PooyanYagh/Bale-SmS/releases/download/v1.0.0/Bale-SMS-v1.0.0.apk)

1. Download the APK from the Release page.
2. Install it on the Android phone containing the SIM card. Android may ask you to allow installation from the browser or file manager.
3. Open the app and grant only the permissions required for the features you enable.

Minimum supported version: **Android 6.0 (API 23)**.

### Quick setup

1. Create a Bale bot and obtain its **Bot Token**. See the official [Bale documentation](https://docs.bale.ai/).
2. Send your bot a message in Bale, such as `/start`.
3. Enter the Bot Token in Bale-SMS.
4. Use **Get recent chat ID**, select your chat, and save the settings.
5. Leave the default API address as `tapi.bale.ai` unless you have a supported alternative.
6. Send a test SMS to the phone and verify that it arrives in Bale.

### Verified features and test status

- Incoming SMS forwarding to Bale was verified on a real device.
- Bale Bot API connection and message delivery were verified.
- Call notifications, remote commands, USSD, dual-SIM behavior, and restart resilience require further device validation.

### Privacy and security

Bot tokens are credentials. Never share them in screenshots, issues, public messages, or this repository. Authorize only your own chat ID, and remove the app's configuration before giving the phone to someone else.

### Credits and license

Bale-SMS is an independent adaptation of [Telegram-SMS](https://github.com/telegram-sms/telegram-sms) for the Bale Bot API. The original attribution and [BSD 3-Clause license](LICENSE) are retained.
