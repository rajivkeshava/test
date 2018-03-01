package com.bookstore.resource;

@RestController
public class LoginResource
{

    @Autowired
    private UserService userService;

    @ReqestMapping("/token")
    public Map<String, String> token(HttpSession session, HttpServletRequest request)
    {
    System.out.println(request.getRemoteHost());

    String remoteHost=request.getRemoteHost();
    int portNumber = request.getPort();

    System.out.println(remoteHost+":"portNumber);
    return Collections.singletonMap("token", session.getId());

    }


