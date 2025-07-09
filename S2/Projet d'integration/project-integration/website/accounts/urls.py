from django.contrib import admin
from django.urls import path
from accounts import views

urlpatterns = [
    path("", views.login_view, name="login"),
    path("logout/", views.logout_view, name="logout"),
    path("dashboard/", views.admin_dashboard, name="dashboard"),
]
