import hashlib
from django.http import HttpResponse, HttpResponseNotFound
from django.shortcuts import render, redirect


# pass="adel2004"
ADMIN_CREDENTIALS = {
    "username": "admin",
    "password": "b95f303486e1f62c7a87fa5a361aa2eac9c858aee7ba8f6105da8a0ad6d8fab9"
}

def hash_password(password):
    return hashlib.sha256(password.encode()).hexdigest()

def login_view(request):
    if request.method == "POST":
        username = request.POST.get("username")
        password = request.POST.get("password")

        if username == ADMIN_CREDENTIALS["username"] and hash_password(password) == ADMIN_CREDENTIALS["password"]:
            request.session["authenticated"] = True
            request.session["username"] = username
            return redirect("/dashboard/") 

        return render(request, "login.html", {"error": "Invalid Credentials"})

    return render(request, "login.html")

def logout_view(request):
    request.session.flush()
    response = redirect("/")
    response.delete_cookie("sessionid")
    return response


def admin_dashboard(request):
    if not request.session.get("authenticated"):
        return HttpResponseNotFound("<h1>404 - Page Not Found</h1>")
    return render(request, "dashboard.html", {"username": request.session.get("username")})
