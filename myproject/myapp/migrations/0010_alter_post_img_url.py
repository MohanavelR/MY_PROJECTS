# Generated by Django 5.1.4 on 2024-12-28 02:33

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('myapp', '0009_alter_post_img_url'),
    ]

    operations = [
        migrations.AlterField(
            model_name='post',
            name='img_url',
            field=models.ImageField(null=True, upload_to='posts/images'),
        ),
    ]
