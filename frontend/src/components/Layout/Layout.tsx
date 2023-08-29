import React, { Fragment, ReactNode } from 'react'
import Header from '../Header/Header';
import Footer from '../Footer/Footer';

import styles from '@/styles/Layout/Layout.module.css'

type LayoutProps = {
  children: ReactNode;
}

const Layout = ( {children}: LayoutProps ) => {
  return (
    <section className={styles.app}>
      <Header />
      <main>
        {children}
      </main>
      <Footer />
    </section>
  )
}

export default Layout
