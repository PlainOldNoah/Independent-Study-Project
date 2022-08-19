# Independent Study Project

Noah MacMinn
Independent Study Summer 2022

## SoftballApp

### How messages are sent
1. A NotificationChannel must be created. In this case it's named "CN1"
2. When the user enters a message sendNotication is called
3. Here new notification is made and then it's attributes are adjusted
- Title is set to "New Message"
- Content is set to the user's message
- Notification extends wearableExtender so it can be used with the watch
4. Notification is built
5. Notification manager is created
6. Notification Manager notifies the connected devices

### Classes
private void createNotificationChannel()
* Creates a channel for notifications to be sent though
* This is done once and at the beginning

public void sendNotification(View view)
* Gets the text in the text edit box and turns it into a notification
* Then sends the notification to the channel established earlier

### Reasoning for Notification Channel
Originally I was working on using bluetooth adapters to send a message but contantly ran into compadibility issues. In my research to try and resolve the issues I came across notifications. This does exactly what was required and has nicer built in classes. These notifications are still sent to bluetooth connected devices but don't require messy UI created on the watch as the notification center handles it all.

### Phone UI
The first approach to the UI was to create a 3x4 grid of buttons numbered 1-9 with #, 0, * as bonuses. This did work but required a lengthy switch statment and required much more fiddling to get things to line up right. These adaptations would also need to be kept in mind while working with other device sizes. Later on I remembered from the tutorial early on that there were different keyboard layouts. So I stripped away all the buttons and left only a text edit box with the "number" input type. This lets Android handle how it's formatted and ends up being faster and more responsive. 
