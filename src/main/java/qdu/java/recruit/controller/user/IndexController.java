package qdu.java.recruit.controller.user;

import io.swagger.annotations.Api;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import qdu.java.recruit.controller.BaseController;


@Controller
@EnableAutoConfiguration
@RequestMapping("/user")
@Api("页面跳转控制器")
public class IndexController extends BaseController {
    private static final Logger LOGGER = LogManager.getLogger();

    /**
     * 用户登录
     *
     * @return
     */
    @GetMapping(value = "/login")
    public String userLogin() {
        return this.userDirect("user_login");
    }

    /**
     * 主页
     *
     * @return
     */
    @GetMapping(value = "")
    public String index() {
        return this.userDirect("index");
    }

    /**
     * 职位搜索 列表页
     *
     * @return
     */
    @GetMapping(value = "/search/{keyword}")
    public String search() {
        return this.userDirect("search_list");
    }

    /**
     * 职位分类 列表页
     *
     * @return
     */
    @GetMapping(value = "/category/{id}")
    public String list() {
        return this.userDirect("category_list");
    }

    /**
     * 职位细节页
     *
     * @return
     */
    @GetMapping(value = "/position/{id}")
    public String getPosition() {
        return this.userDirect("position_detail");
    }

    /**
     * 用户中心页
     *
     * @return
     */
    @GetMapping(value = "/info")
    public String userInfo() {
        return this.userDirect("user_info");
    }

    /**
     * 用户简历页
     * @return
     */
    @GetMapping(value = "/resume")
    public String userResume() {
        return this.userDirect("user_resume");
    }


    @GetMapping(value = "/test")
    public String usertest() {
        return this.userDirect("position_detail");
    }

}