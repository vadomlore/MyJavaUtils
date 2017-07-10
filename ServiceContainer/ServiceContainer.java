package bservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by zyl on 2017/7/10.
 */
public class ServiceContainer
{
    Logger logger = Logger.getLogger(ServiceContainer.class.getName());

    public ServiceContainer(){
        logger.setLevel(Level.WARNING);
    }
    private HashMap<Class, IService> singletonServices = new HashMap<>();

    private ArrayList<Class<? extends IService>> scopeServices = new ArrayList<>();

    public <T> T resolveSingleton(Class<T> clazz)
    {
        return (T) singletonServices.get(clazz);
    }

    public <T> T resolveScope(Class<T> clazz)
    {
        for (Class<? extends IService> scopeService : scopeServices)
        {
            if (scopeService.getName().equals(clazz.getName()))
            {
                try{
                    T t = (T) scopeService.newInstance();
                    return t;
                } catch (InstantiationException e)
                {
                    logger.warning(clazz.getName() + "not register in service container scope");
                    return null;
                } catch (IllegalAccessException e)
                {
                    logger.warning(clazz.getName() + "not register in service container scope");
                    return null;
                }
                catch (Exception e){
                    logger.warning(clazz.getName() + "not register in service container scope");
                }
            }
        }
        logger.warning(clazz.getName() + "not register in service container scope");
        return null;
    }

    public void registerSingleton(IService service)
    {
        this.singletonServices.put(service.getClass(), service);
    }

    public void registerScope(Class<? extends IService> clazz)
    {
        scopeServices.add(clazz);
    }


    public static void main(String[] args)
    {
        ServiceContainer container = new ServiceContainer();
        container.registerSingleton(new ServiceA());
        container.registerSingleton(new ServiceB());

        container.registerScope(ServiceA.class);
        container.registerScope(ServiceB.class);


        ServiceA sva = container.resolveSingleton(ServiceA.class);
        sva.SerivceMe();
        ServiceB svb = container.resolveSingleton(ServiceB.class);
        svb.SerivceB();


        ServiceA svascop = container.resolveScope(ServiceA.class);
        svascop.SerivceMe();
        ServiceB svbscop = container.resolveScope(ServiceB.class);
        svbscop.SerivceB();

        ServiceC svcscop = container.resolveScope(ServiceC.class);
        svcscop.SerivceC();

    }

}
