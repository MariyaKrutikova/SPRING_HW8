Базовое задание:


Домашнее задание выполнить для одного из пройденных семинаров в проекте с Базой Данных.


Вам необходимо разработать механизм регистрации действий пользователя в вашем Spring Boot приложении. 
Используйте Spring AOP для создания журнала действий, в котором будет сохраняться информация о том, какие методы сервиса вызывались, кем и с какими параметрами.

1. Создайте аннотацию @TrackUserAction.
2. Реализуйте aspect, который будет регистрировать действия пользователя, когда вызывается метод, отмеченный этой аннотацией.
3. Примените аннотацию @TrackUserAction к нескольким методам в слое сервиса.
4. Результаты регистрации в консоль