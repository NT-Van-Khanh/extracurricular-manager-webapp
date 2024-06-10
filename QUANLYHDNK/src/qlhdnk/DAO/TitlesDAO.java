package qlhdnk.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import qlhdnk.entity.TitlesEntity;

@Transactional
@Repository
public class TitlesDAO {
	@Autowired
	private SessionFactory sessionFactory;
		
		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}
		
		public List<TitlesEntity> getListTitle(){
			Session session = sessionFactory.getCurrentSession();
			@SuppressWarnings("unchecked")
			List<TitlesEntity> list = session.createQuery("FROM TitlesEntity ORDER BY idTitle ASC").list();
			return list;
		}
}
