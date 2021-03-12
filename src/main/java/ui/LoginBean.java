package ui;

import model.User;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class LoginBean
{
    private User user;

    public LoginBean()
    {
        this.user = new User();
    }

    public String connect()
    {
        if (this.user.getUsername().equals("admin") && this.user.getPwd().equals("passer"))
        {
            return "home";
        }
        FacesMessage facesMessage = new FacesMessage("Login ou password incorrect", "Login ou password incorrect");
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
        return "index";
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }
}
