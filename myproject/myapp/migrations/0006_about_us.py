# Generated by Django 5.1.4 on 2024-12-27 07:53

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('myapp', '0005_rename_categoty_post_category'),
    ]

    operations = [
        migrations.CreateModel(
            name='About_us',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('content', models.TextField()),
            ],
        ),
    ]
