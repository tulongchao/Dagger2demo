package tfc.com.dagger2demo.dagger;

import dagger.Component;
import tfc.com.dagger2demo.MainActivity;

/**
 * 功能概要描述：          <br/>
 * 功能详细描述：          <br/>
 * 作者： tufengchao         <br/>
 * 创建日期： 2017/3/2     <br/>
 * 修改人：               <br/>
 * 修改日期：             <br/>
 * 版本号：               <br/>
 * 版权所有：Copyright © 2015-2016 上海览益信息科技有限公司 http://www.lanyife.com
 */
@Component
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}
