import React from "react";

import Image from "next/image";

import styles from "@/styles/Header/Header.module.css";
import Link from "next/link";

const Header = () => {
  return (
    <header
      className={`flex flex-col border-b-1 text-white box-border items-center ${styles.header}`}
    >
      <section className={styles.headerWrapper}>
        <section className={`flex flex-row items-center gap-3 p-1`}>
          
          <Image
            src="https://via.placeholder.com/250x50"
            width={250}
            height={60}
            alt=""
          />

          <h1 className={styles.title}>Document Creator</h1>
        </section>
        
        <section>
          <ul className="flex flex-row">
            <li>
              <Link className={styles.menuItem} href="#">Item 1</Link>
            </li>
            <li>
              <Link className={styles.menuItem} href="#">Item 2</Link>
            </li>
            <li>
              <Link className={styles.menuItem} href="#">Item 3</Link>
            </li>
            <li>
              <Link className={styles.menuItem} href="#">Item 4</Link>
            </li>
          </ul>
        </section>
      </section>
    </header>
  );
};

export default Header;
