package ru.bellintegrator.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import ru.bellintegrator.model.WeatherModel;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by MADmitriev on 14.06.2017.
 */
@Repository
public class WeatherDAO {
    private final Logger log = LoggerFactory.getLogger(WeatherDAO.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void create(WeatherModel weatherModel) {
        try {
            entityManager.persist(weatherModel);
        }catch (Exception e){
            log.info("Creation error. Can not persist weatherModel\nException: " + e.toString());
        }
    }

    @Transactional
    public void insert(WeatherModel weatherModel){
        try {
            entityManager.persist(weatherModel);
        }catch (Exception e){
            log.info("Insertion error. Can not persist weatherModel\nException: " + e.toString());
        }
    }

    public WeatherModel update(WeatherModel weatherModel) throws Exception{
        return entityManager.merge(weatherModel);
    }

    public List<WeatherModel> getAll() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<WeatherModel> query = criteriaBuilder.createQuery(WeatherModel.class);
        Root<WeatherModel> root = query.from(WeatherModel.class);
        query.select(root);
        TypedQuery<WeatherModel> allWeather = entityManager.createQuery(query);
        return allWeather.getResultList();
    }

    public void delete(WeatherModel weatherModel) {
        if (weatherModel != null) {
            entityManager.remove(weatherModel);
        }else{
            log.info("Deleting error. account not find");
        }
    }

    public WeatherModel getById(String city) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<WeatherModel> query = criteriaBuilder.createQuery(WeatherModel.class);
        Root<WeatherModel> root = query.from(WeatherModel.class);
        query.where(criteriaBuilder.equal(root.get("city"), city));
        query.select(root);
        TypedQuery<WeatherModel> allWeather = entityManager.createQuery(query);
        return allWeather.getResultList().get(0);
    }

}
